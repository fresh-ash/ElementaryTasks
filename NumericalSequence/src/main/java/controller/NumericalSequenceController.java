package controller;

import interfaces.IValidator;
import interfaces.Input;
import interfaces.Messages;
import model.FirstNumberOfSequence;
import org.apache.log4j.Logger;
import util.MathOperations;
import view.INumericalSequenceView;

import java.util.List;

public class NumericalSequenceController {

    INumericalSequenceView view;
    Input cli;
    FirstNumberOfSequence firstNumberOfSequence;
    Integer sequenceLength;
    public static final Logger log = Logger.getLogger(NumericalSequenceController.class);

    public NumericalSequenceController(INumericalSequenceView view, Input cli) {
        this.view = view;
        this.cli = cli;
        log.info("Create controller");
    }

    public void showWelcomeMessageAndStart(){
        view.showWelcomeMessage(Messages.NUMERICAL_SEQUENCE_WELCOME_MESS);
        log.info("Start application");
        startNumericalSequenceApp();
    }

    public void getAndValidateData() throws IllegalArgumentException{
        String[] data = Input.splitInput(cli.waitInput(Messages.NUMERICAL_SEQUENCE_GET_LENGTH_SEQUENCE), ",");
        if (data.length != 2){
            log.error("Incorrect input! Few arguments!");
            throw new IllegalArgumentException();
        }
        sequenceLength = IValidator.getPositiveIntegerFromString(data[0]);
        Integer number = IValidator.getPositiveIntegerFromString(data[1]);
        firstNumberOfSequence = new FirstNumberOfSequence(Math.sqrt(number));
    }

    public void startNumericalSequenceApp(){
        try {
            getAndValidateData();
            log.info("Get correct data");
            Integer startSequence = firstNumberOfSequence.getOutput();
            List<Integer> sequence = MathOperations.getIntegerSequenceAsList(startSequence,
                                        startSequence + sequenceLength);
            log.info("Show result");
            view.showSequence(sequence);
        }
        catch (IllegalArgumentException e){
            System.err.println(Messages.INCORRECT_INPUT);
        }
        catch (Exception e){
            log.error(e.getMessage());
            System.err.println(e.getMessage());
        }
        if (cli.checkAnswer(Messages.CHECK_ANSWER)){
            startNumericalSequenceApp();
        }
    }
}
