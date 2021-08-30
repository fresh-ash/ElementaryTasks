package service;

import model.CustomerCountStrategy;
import model.HappyTicketsHolder;
import model.Ticket;
import java.util.List;

public class TicketsHelper {

    HappyTicketsHolder easyWay;
    HappyTicketsHolder difficultWay;

    public TicketsHelper(HappyTicketsHolder easyWay, HappyTicketsHolder difficultWay) {
        this.easyWay = easyWay;
        this.difficultWay = difficultWay;
    }

    public void countHappyTickets(int startSequence, int endSequence) throws IllegalArgumentException{
        if (startSequence < 0 || endSequence < 0){
            throw new IllegalArgumentException("Arguments for \'countHappyTicket\' function must be positive!");
        }
        for (int i = startSequence; i <= endSequence; i++){
            Ticket ticket = new Ticket(i);
            List<Integer> numberAsList = ticket.getNumberAsArray();
            easyWay.countTickets(numberAsList);
            difficultWay.countTickets(numberAsList);
        }
    }

    public int getWinner(){
        return easyWay.getCountHappyTickets().compareTo(difficultWay.getCountHappyTickets());
    }

    public HappyTicketsHolder getEasyWay() {
        return easyWay;
    }

    public void setEasyWay(HappyTicketsHolder easyWay) {
        this.easyWay = easyWay;
    }

    public HappyTicketsHolder getDifficultWay() {
        return difficultWay;
    }

    public void setDifficultWay(HappyTicketsHolder difficultWay) {
        this.difficultWay = difficultWay;
    }
}
