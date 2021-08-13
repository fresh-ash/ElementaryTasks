package util;

public class MathOperations {

    public static float getSumValues(float sideX, float sideY){
        float summa = sideX + sideY;
        return summa;
    }

    public static Boolean compareTwoValue(float first, float second){
        Boolean state;
        if (first > second){
            state = true;
        }
        else if (first < second){
            state = false;
        }
        else {
            state = null;
        }
        return state;
    }

    public static boolean checkValidTriangle(float sideA, float sideB, float sideC){
        if ((MathOperations.compareTwoValue(getSumValues(sideA, sideB), sideC) != null)
                && (MathOperations.compareTwoValue(getSumValues(sideB, sideC), sideA) != null)
                &&  (MathOperations.compareTwoValue(getSumValues(sideA, sideC), sideB) != null)){
            return true;
        }
        return false;
    }

    //Можно перегрузить для экземпляра объекта
    public static double getTriangleSquare(float sideA, float sideB, float sideC) throws IllegalArgumentException{
        double triangleSquare;
        if (checkValidTriangle(sideA, sideB, sideC)) {
            float halfOfPerimeter = (sideA + sideB + sideC) / 2;
            triangleSquare = Math.sqrt((halfOfPerimeter * (halfOfPerimeter - sideA)
                    * (halfOfPerimeter - sideB) * (halfOfPerimeter - sideC)));
            return triangleSquare;
        }
        else {
            return 0;
        }
    }
}
