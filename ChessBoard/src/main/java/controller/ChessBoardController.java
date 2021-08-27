package controller;

import interfaces.Input;
import interfaces.Messages;
import model.ChessBoardBuilder;
import interfaces.IValidator;
import view.IViewChessBoardApp;

public class ChessBoardController {

    IViewChessBoardApp viewChessBoardApp;
    Input cli;
    Integer height;
    Integer width;

    public ChessBoardController(IViewChessBoardApp viewChessBoardApp, Input cli) {
        this.viewChessBoardApp = viewChessBoardApp;
        this.cli = cli;
    }

    public void showWelcomeMessAndStartApp(){
        viewChessBoardApp.showWelcomeMess(Messages.CHESS_BOARD_WELCOME_MESS);
        startChessBoardApp();
    }

    String[] getDataFromInput() throws IllegalArgumentException{
        String[] input = Input.splitInput(cli.waitInput(Messages.CHESS_BOARD_FORMAT_INPUT),",");
        if(input.length != 2){
            throw new IllegalArgumentException();
        }
        return input;
    }

    public void startChessBoardApp(){
        try{
            String[] data = getDataFromInput();
            this.height = IValidator.getPositiveIntegerFromString(data[0]);
            this.width = IValidator.getPositiveIntegerFromString(data[1]);
            if (IValidator.checkZeroValue(width) || IValidator.checkZeroValue(height)){
                throw new IllegalArgumentException();
            }
            ChessBoardBuilder boardBuilder = new ChessBoardBuilder();
            boardBuilder.setHeight(height);
            boardBuilder.setWidth(width);
            viewChessBoardApp.showBoard(boardBuilder.getBoard());
        }
        catch (IllegalArgumentException e){
             System.err.println(Messages.INCORRECT_INPUT);
        }
        catch (Exception e){
            System.err.println(Messages.UNDEFINED_ERR + e.getMessage());
        }
        if (cli.checkAnswer(Messages.CHECK_ANSWER)){
            startChessBoardApp();
        }
    }
}
