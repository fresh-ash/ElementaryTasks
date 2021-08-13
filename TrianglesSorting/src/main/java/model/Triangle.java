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

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    public Double getSideC() {
        return sideC;
    }

    public void setSideC(Double sideC) {
        this.sideC = sideC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
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
