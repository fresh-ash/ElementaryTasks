package interfaces;

import input.Validated;
import java.util.List;

public interface IValidator {

    List<Validated> validateData(String[] args, int neededCountArgs);

    static boolean checkNullValue(Number value){
        return value == null;
    }

    static boolean checkZeroValue(Number value){
        return value.doubleValue() == 0;
    }

    static boolean checkNegativeValue(Number value){
        return value.doubleValue() < 0;
    }
}
