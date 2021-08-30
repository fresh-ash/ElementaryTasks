package model;

import java.util.List;
import java.util.function.BiFunction;

public abstract class BaseCountStrategy implements ICountStrategy{

    BiFunction<Integer, Integer, Boolean> predictFunction;

    @Override
    public boolean checkTicket(List<Integer> number) throws IllegalArgumentException{
        int sumOfFirstSequence = 0;
        int sumOfSecondSequence = 0;
        for (int i = 0; i < number.size(); i++){
            if(number.get(i) < 0){
                throw new IllegalArgumentException("Negative value!");
            }
            if(predictFunction.apply(i, number.get(i))){
                sumOfFirstSequence += number.get(i);
            }
            else {
                sumOfSecondSequence += number.get(i);
            }
        }
        return sumOfFirstSequence == sumOfSecondSequence;
    }

    public BiFunction<Integer, Integer, Boolean> getPredictFunction() {
        return predictFunction;
    }

    public void setPredictFunction(BiFunction<Integer, Integer, Boolean> predictFunction) {
        this.predictFunction = predictFunction;
    }
}
