package util;

public class Validator {

    private Validator() {
    }

    public static boolean checkNullValue(Number value){
        return value == null;
    }

    public static boolean checkZeroValue(Number value){
        return value.doubleValue() == 0;
    }

    public static boolean checkNegativeValue(Number value){
        return value.doubleValue() < 0;
    }

    public static Integer getPositiveIntegerFromString(String str) throws IllegalArgumentException{
        Integer data = Integer.valueOf(str);
        if( Validator.checkNegativeValue(data)){
            throw new IllegalArgumentException("Negative value!");
        }
        return data;
    }

    public static Double getDoubleFromString(String str) throws IllegalArgumentException{
        Double data = Double.valueOf(str);
        if(Validator.checkZeroValue(data) || Validator.checkNegativeValue(data)){
            throw new IllegalArgumentException();
        }
        return data;
    }

    public static String getStringFromInput(String str) throws IllegalArgumentException{
        if (str.equals("")){
            throw new IllegalArgumentException();
        }
        return str;
    }
}
