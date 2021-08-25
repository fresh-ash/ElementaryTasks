package model;

import java.util.List;

public class CustomerCountStrategy implements ICountStrategy{
    @Override
    public boolean checkTicket(List<Integer> number) {
        int sumOfFirstSequence = 0;
        int sumOfSecondSequence = 0;
        for (Integer num : number){
            if (num%2 == 0){
                sumOfFirstSequence += num;
            }
            else {
                sumOfSecondSequence += num;
            }
        }
        return sumOfFirstSequence == sumOfSecondSequence;
    }
}
