package model;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    boolean easyHappy;
    boolean difficultHappy;
    boolean customerHappy;
    int number;

    public Ticket(int number) {
        this.number = number;
    }

    public List<Integer> getNumberAsArray(){
        int tempNumber = this.number;
        List<Integer> numberAsList = new ArrayList<>();
        while (tempNumber > 0){
            numberAsList.add(tempNumber%10);
            tempNumber /= 10;
        }
        return numberAsList;
    }

    public boolean isCustomerHappy() {
        return customerHappy;
    }

    public void setCustomerHappy(boolean customerHappy) {
        this.customerHappy = customerHappy;
    }

    public boolean isEasyHappy() {
        return easyHappy;
    }

    public void setEasyHappy(boolean easyHappy) {
        this.easyHappy = easyHappy;
    }

    public boolean isDifficultHappy() {
        return difficultHappy;
    }

    public void setDifficultHappy(boolean difficultHappy) {
        this.difficultHappy = difficultHappy;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
