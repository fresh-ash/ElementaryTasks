package controller;

import interfaces.IValidator;
import interfaces.Input;
import interfaces.Messages;
import model.MagicNumber;
import util.MathOperations;
import view.INumericalSequenceView;

import java.util.List;

public class NumericalSequenceController {

    INumericalSequenceView view;
    Input cli;
    MagicNumber magicNumber;
    Integer sequenceLength;

    public NumericalSequenceController(INumericalSequenceView view, Input cli) {
        this.view = view;
        this.cli = cli;
    }

    public void showWelcomeMessageAndStart(){
        view.showWelcomeMessage(Messages.NUMERICAL_SEQUENCE_WELCOME_MESS);
        startNumericalSequenceApp();
    }

    public void getAndValidateData() throws IllegalArgumentException{
        String[] data = Input.splitInput(cli.waitInput(Messages.NUMERICAL_SEQUENCE_GET_LENGTH_SEQUENCE), ",");
        if (data.length == 2){
            sequenceLength = IValidator.getPositiveIntegerFromString(data[0]);
            Integer number = IValidator.getPositiveIntegerFromString(data[1]);
            magicNumber = new MagicNumber(Math.sqrt(number));
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void startNumericalSequenceApp(){
        try {
            getAndValidateData();
            List<Integer> sequence = MathOperations.getIntegerSequenceAsList(magicNumber.getOutput(),
                                        magicNumber.getOutput() + sequenceLength);
            view.showSequence(sequence);
        }
        catch (IllegalArgumentException e){
            System.err.println(Messages.INCORRECT_INPUT);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        if (cli.checkAnswer(Messages.CHECK_ANSWER)){
            startNumericalSequenceApp();
        }
        else {
            return;
        }

    }

}
