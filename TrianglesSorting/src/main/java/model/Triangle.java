package model;

public class Triangle implements Comparable<Triangle>{

    float sideA;
    float sideB;
    float sideC;
    String name;
    Double square;

    public Triangle(String name, float sideA, float sideB, float sideC, Double square) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = name;
        this.square = square;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
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
        int compareResult = (int) (square - o.getSquare());
        return compareResult;
    }
}
