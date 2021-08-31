package controller;

import interfaces.Input;
import interfaces.Messages;
import service.StringManager;
import util.FileIOService;
import view.IViewFileParserApp;

import java.io.IOException;

public class FileParserController {

    IViewFileParserApp view;
    Input cli;

    public FileParserController(IViewFileParserApp view, Input cli) {
        this.view = view;
        this.cli = cli;
    }

    String[] getDataFromInput() throws IllegalArgumentException{
        String[] input = cli.waitInput(Messages.PARSER_WELCOME_MESSAGE).split(",");
        if (input.length < 2 || input.length > 3){
            throw new IllegalArgumentException();
        }
        return input;
    }

    public void startFileParserApp() throws IOException {

        try {
            String[] data = getDataFromInput();
            String string = FileIOService.readFileAsString(data[0]);
            if (data.length == 2){
                view.showResult(StringManager.countStrings(string, data[1]));
            }
            else {
                FileIOService.writeToFile(string.replaceAll(data[1], data[2]), data[0]);
                System.out.println("Success!");
            }
        }
        catch (IllegalArgumentException e){
            System.err.println("Incorrect input!");
        }
        catch (IOException e){
            System.err.println("File not found!");
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

        if (cli.checkAnswer(Messages.CHECK_ANSWER)){
            startFileParserApp();
        }
    }
}
