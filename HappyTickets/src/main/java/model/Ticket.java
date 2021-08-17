package model;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    boolean easyHappy;
    boolean difficultHappy;
    int number;

    public Ticket(int number) {
        this.number = number;
    }

    public List<Byte> getNumberAsArray(){
        int tempNumber = this.number;
        List<Byte> numberAsList = new ArrayList<>();
        while (tempNumber > 0){
            numberAsList.add((byte) (tempNumber%10));
            tempNumber /= 10;
        }
        return numberAsList;
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
