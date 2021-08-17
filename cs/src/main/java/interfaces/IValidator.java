package interfaces;

import input.ValidData;
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

    static Integer getIntegerFromString(String str) throws IllegalArgumentException{
        Integer data = Integer.valueOf(str);
        if( IValidator.checkNegativeValue(data)){
            throw new IllegalArgumentException();
        }
        else {
            return data;
        }
    }

    static Double getDoubleFromString(String str) throws IllegalArgumentException{
        Double data = Double.valueOf(str);
        if(IValidator.checkZeroValue(data) || IValidator.checkNegativeValue(data)){
            throw new IllegalArgumentException();
        }
        else {
            return data;
        }
    }

    static String getStringFromInput(String str) throws IllegalArgumentException{
        if (str != ""){
            return str;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
