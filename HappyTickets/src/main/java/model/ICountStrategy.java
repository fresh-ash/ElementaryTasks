package model;

import java.util.List;
import java.util.function.BiFunction;

public interface ICountStrategy {
    boolean checkTicket(List<Integer> number);
    BiFunction<Integer, Integer, Boolean> getPredictFunction();

}
