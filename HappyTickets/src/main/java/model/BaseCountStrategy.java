package model;

import java.util.List;
import java.util.function.BiFunction;

public class BaseCountStrategy implements ICountStrategy{

    BiFunction<Integer, Integer, Boolean> function;

    @Override
    public boolean checkTicket(List<Integer> number) {
        int sumOfFirstSequence = 0;
        int sumOfSecondSequence = 0;
        for (int i = 0; i < number.size(); i++){
            if(function.apply(i, number.get(i))){
                sumOfFirstSequence += number.get(i);
            }
            else {
                sumOfSecondSequence += number.get(i);
            }
        }
        return sumOfFirstSequence == sumOfSecondSequence;
    }
}
