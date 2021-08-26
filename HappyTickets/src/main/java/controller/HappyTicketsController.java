package controller;

import interfaces.IValidator;
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

    public HappyTicketsController(IViewHappyTickets view, Input cli) {
        this.view = view;
        this.cli = cli;
    }

    public void showWelcomeMessAndStart(){
        view.showWelcomeMess(Messages.HAPPY_TICKET_WELCOME_MESSAGE);
        startHappyTicketApp();
    }

    void getAndValidateData() throws IllegalArgumentException{
        String[] data = Input.splitInput(cli.waitInput(Messages.HAPPY_TICKET_FORMAT_INPUT), ",") ;
        if (data.length != 2){
            throw new IllegalArgumentException();
        }
        startSequence = IValidator.getPositiveIntegerFromString(data[0]);
        finishSequence = IValidator.getPositiveIntegerFromString(data[1]);
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
            System.err.println(Messages.INCORRECT_INPUT);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        if (cli.checkAnswer(Messages.CHECK_ANSWER)){
            startHappyTicketApp();
        }
    }
}
