package controller;

import util.Validator;
import interfaces.Input;
import interfaces.Messages;
import model.DifficultCountStrategy;
import model.EasyCountStrategy;
import model.HappyTicketsHolder;
import service.TicketsHelper;
import view.IViewHappyTickets;

public class HappyTicketsController {

    IViewHappyTickets view;
    Input cli;
    Integer startSequence;
    Integer finishSequence;
    String[] data;

    public HappyTicketsController(IViewHappyTickets view, Input cli) {
        this.view = view;
        this.cli = cli;
    }

    public void showWelcomeMessAndStart(){
        view.showInfoMessage(Messages.HAPPY_TICKET_WELCOME_MESSAGE);
        startHappyTicketApp();
    }

    void validateInputData() throws IllegalArgumentException{
        if (data.length != 2 || data[0].equals("") || data[1].equals("")){
            throw new IllegalArgumentException("Need to enter two parameters!");
        }
        if (data[0].length() > 6 || data[1].length() > 6){
            throw new IllegalArgumentException("Ticket number can't be more than 999999!");
        }
    }

    void getAndValidateData() throws IllegalArgumentException{
        String inputData = cli.waitInput(Messages.HAPPY_TICKET_FORMAT_INPUT);
        data = Input.splitInput(inputData, ",") ;
        validateInputData();
        startSequence = Validator.getPositiveIntegerFromString(data[0]);
        finishSequence = Validator.getPositiveIntegerFromString(data[1]);
    }

    public void startHappyTicketApp(){
        try {
            getAndValidateData();
            HappyTicketsHolder easyWay = new HappyTicketsHolder(new EasyCountStrategy());
            HappyTicketsHolder difficultWay = new HappyTicketsHolder(new DifficultCountStrategy());
            TicketsHelper ticketsHelper = new TicketsHelper(easyWay, difficultWay);
            ticketsHelper.countHappyTickets(startSequence, finishSequence);
            view.showResult(easyWay.getCountHappyTickets(), difficultWay.getCountHappyTickets(), ticketsHelper.getWinner());
        }
        catch (IllegalArgumentException e){
            view.showInfoMessage(Messages.INCORRECT_INPUT + e.getMessage());
        }
        catch (Exception e){
            view.showInfoMessage("Something went wrong!");
        }
        if (cli.checkAnswer(Messages.CHECK_ANSWER)){
            startHappyTicketApp();
        }
    }
}
