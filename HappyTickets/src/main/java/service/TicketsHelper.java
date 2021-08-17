package service;

import model.Ticket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketsHelper {

    public static Map<String, Integer> countHappyTickets(int startSequence, int endSequence){
        Map<String, Integer> ticketsCount = new HashMap<>();
        int easyWay = 0;
        int difficultWay = 0;
        for (int i = startSequence; i <= endSequence; i++){
            Ticket ticket = new Ticket(i);
            List<Byte> numberAsList = ticket.getNumberAsArray();
            if(isEasyHappy(numberAsList)){
                easyWay += 1;
            }
            if (isDifficultHappy(numberAsList)) {
                difficultWay += 1;
            }
        }
        ticketsCount.put("EasyWay", easyWay);
        ticketsCount.put("DifficultWay", difficultWay);
        return ticketsCount;
    }

    public static boolean isEasyHappy(List<Byte> number){
        int sumOfFirstSequence = 0;
        int sumOfSecondSequence = 0;
        for (int i = 0; i < number.size(); i++){
            if (i > 2){
                sumOfSecondSequence += number.get(i);
            }
            else {
                sumOfFirstSequence += number.get(i);
            }
        }
        return sumOfFirstSequence == sumOfSecondSequence;
    }

    public static boolean isDifficultHappy(List<Byte> number){
        int sumEven = 0;
        int sumUneven = 0;
        for (Byte num : number){
            if(num%2 == 0){
                sumEven += num;
            }
            else {
                sumUneven += num;
            }
        }
        return sumEven == sumUneven;
    }
}
