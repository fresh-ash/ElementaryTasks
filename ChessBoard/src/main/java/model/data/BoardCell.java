package model.data;

public class BoardCell {

    Color color;
    int abscissa;
    int ordinate;

    //Возможно класс Point?!
    public BoardCell(int abscissa, int ordinate, Color color) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
