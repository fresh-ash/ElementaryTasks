package model;

public class NumberInWords {

    int number;
    boolean minus;
    String millions;
    String thousands;
    String hundreds;
    String tens;
    String units;

    public boolean isMinus() {
        return minus;
    }

    public void setMinus(boolean minus) {
        this.minus = minus;
    }

    public NumberInWords(int number) {
        this.number = number;
    }

    public String getMillions() {
        return millions;
    }

    public void setMillions(String millions) {
        this.millions = millions;
    }

    public String getThousands() {
        return thousands;
    }

    public void setThousands(String thousands) {
        this.thousands = thousands;
    }

    public String getHundreds() {
        return hundreds;
    }

    public void setHundreds(String hundreds) {
        this.hundreds = hundreds;
    }

    public String getTens() {
        return tens;
    }

    public void setTens(String tens) {
        this.tens = tens;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        String str = "";
        if (minus){
            str += "minus ";
        }
        if(millions != null){
            str += millions + " million, ";
        }
        if (thousands != null && thousands != "") {
            str += thousands + " thousand, ";
        }
        if(hundreds != null){
            str += hundreds;
        }
        return str;
    }
}
