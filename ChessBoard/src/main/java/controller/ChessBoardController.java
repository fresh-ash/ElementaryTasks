package controller;

import input.Validated;
import interfaces.Messages;
import model.ChessBoardBuilder;
import interfaces.IValidator;
import view.IViewChessBoardApp;

import java.util.List;

public class ChessBoardController {

    IViewChessBoardApp viewChessBoardApp;
    IValidator validator;

    public ChessBoardController(IViewChessBoardApp viewChessBoardApp, IValidator validator) {
        this.viewChessBoardApp = viewChessBoardApp;
        this.validator = validator;
    }

    public void startChessBoardApp(String[] args){
        int neededArgsCont = 2;
        try{
            List<Validated> argsList = validator.validateData(args, neededArgsCont);
            ChessBoardBuilder boardBuilder = new ChessBoardBuilder();
            boardBuilder.setHeight((Integer) argsList.get(0).get());
            boardBuilder.setWidth((Integer) argsList.get(1).get());
            viewChessBoardApp.showBoard(boardBuilder.getBoard());
        }
        catch (IllegalArgumentException e){
             System.err.println(Messages.INCORRECT_INPUT);
        }
        catch (Exception e){
            System.err.println(Messages.UNDEFINED_ERR + e.getMessage());
        }
    }
}
