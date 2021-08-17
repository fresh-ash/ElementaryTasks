package controller;

import cli.CLI;
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
            StringBuilder stringBuilder = FileIOService.readFileAsString(data[0]);
            if (data.length == 2){
                view.showResult(StringManager.countStrings(stringBuilder.toString(), data[1]));
            }
            else {
                stringBuilder.replace(0, stringBuilder.length(), data[2]);
                System.out.println(stringBuilder);
            }
        }
        catch (IllegalArgumentException e){
            startFileParserApp();
        }
    }
}
