package util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MathOperations {

    public static Double getSumValues(Double sideX, Double sideY){
        Double summa = sideX + sideY;
        return summa;
    }

    public static boolean checkValidTriangle(Double sideA, Double sideB, Double sideC) throws IllegalArgumentException{
        if ((getSumValues(sideA, sideB).compareTo(sideC) > 0 && getSumValues(sideB, sideC).compareTo(sideA) > 0
                        && getSumValues(sideA, sideC).compareTo(sideB) > 0)) {
            return true;
        }
        return false;
    }

    //Можно перегрузить для экземпляра объекта
    public static Double getTriangleSquare(Double sideA, Double sideB, Double sideC) throws IllegalArgumentException{
        Double triangleSquare;
        if (checkValidTriangle(sideA, sideB, sideC)) {
            Double halfOfPerimeter = (sideA + sideB + sideC) / 2;
            triangleSquare = Math.sqrt((halfOfPerimeter * (halfOfPerimeter - sideA)
                    * (halfOfPerimeter - sideB) * (halfOfPerimeter - sideC)));
            return triangleSquare;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static List<Integer> getIntegerSequenceAsList(int start, int end){
        return IntStream.range(start, end).boxed().collect(Collectors.toList());
    }
}
