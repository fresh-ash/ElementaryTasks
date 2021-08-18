package controller;

import interfaces.IValidator;
import interfaces.Input;
import interfaces.Messages;
import service.TicketsHelper;
import view.IViewHappyTickets;

import java.util.Arrays;
import java.util.Map;

public class HappyTicketsController {

    IViewHappyTickets view;
    Input cli;
    Integer startSequence;
    Integer finishSequence;


    public HappyTicketsController(IViewHappyTickets view, Input cli) {
        this.view = view;
        this.cli = cli;
    }

    void getAndValidateData() throws IllegalArgumentException{
        String[] data = Input.splitInput(cli.waitInput("Please, type MIN and MAX numbers of ticket!\n < min >, < max >:"), ",") ;
        if (data.length == 2){
            startSequence = IValidator.getIntegerFromString(data[0]);
            finishSequence = IValidator.getIntegerFromString(data[1]);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void startHappyTicketApp(){
        try {
            getAndValidateData();
            Map<String, Integer> happyTickets = TicketsHelper.countHappyTickets(startSequence, finishSequence);
            view.showResult(happyTickets, getWinner(happyTickets));
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
        else {
            return;
        }
    }

    public void showWelcomeMessAndStart(){
        view.showWelcomeMess(Messages.HAPPY_TICKET_WELCOME_MESSAGE);
        startHappyTicketApp();
    }

    String getWinner(Map<String, Integer> map){
        String winner;
        if (map.get("EasyWay") > map.get("DifficultWay")){
            winner = "EasyWay wins";
        }
        else if (map.get("EasyWay") < map.get("DifficultWay")){
            winner = "DifficultWay wins";
        }
        else winner = "Draw";
        return winner;
    }
}
