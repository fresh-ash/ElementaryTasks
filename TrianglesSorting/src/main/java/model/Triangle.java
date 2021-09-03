package model;

public class Triangle implements Comparable<Triangle>{

    Double sideA;
    Double sideB;
    Double sideC;
    String name;
    Double square;

    public Triangle(String name, Double sideA, Double sideB, Double sideC, Double square) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = name;
        this.square = square;
    }

    public Double getSideA() {
        return sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public Double getSideC() {
        return sideC;
    }

    public String getName() {
        return name;
    }


    public Double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        String str = "[Triangle "+ this.name + "]: "+ this.square +" cm^2\n";
        return str;
    }

    @Override
    public int compareTo(Triangle o) {
        int compareResult;
        if (this.name.equals(o.getName())){
            compareResult = 0;
            return compareResult;
        }
        compareResult = (int) (square - o.getSquare());
        return compareResult;
    }
}
