package model;

import java.util.List;

public class DifficultCountStrategy implements ICountStrategy {

    @Override
    public boolean checkTicket(List<Integer> number) {
        int sumOfFirstSequence = 0;
        int sumOfSecondSequence = 0;
        for (int i = 0; i < number.size(); i++){
            if(i%2 == 0){
                sumOfFirstSequence += number.get(i);
            }
            else {
                sumOfSecondSequence += number.get(i);
            }
        }
        return sumOfFirstSequence == sumOfSecondSequence;
    }
}
