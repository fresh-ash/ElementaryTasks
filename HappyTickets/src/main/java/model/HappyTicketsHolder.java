package model;

import java.util.List;

public class HappyTicketsHolder {

    Integer countHappyTickets;
    ICountStrategy strategy;

    public HappyTicketsHolder(ICountStrategy strategy) {
        this.countHappyTickets = 0;
        this.strategy = strategy;
    }

    public void countTickets(List<Integer> number){
        if (this.strategy.checkTicket(number)) {
            this.countHappyTickets++;}
    }

    public Integer getCountHappyTickets() {
        return countHappyTickets;
    }

    public void setCountHappyTickets(Integer countHappyTickets) {
        this.countHappyTickets = countHappyTickets;
    }

    public ICountStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ICountStrategy strategy) {
        this.strategy = strategy;
    }
}
