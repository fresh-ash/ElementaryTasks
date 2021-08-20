package model;

public class MagicNumber {

    Double input;
    Integer output;

    public MagicNumber(Double input) {
        this.input = input;
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }

    public Integer getOutput() {
        Integer tempInput = input.intValue();
        if(input > tempInput){
            output = tempInput + 1;
            return output;
        }
        else {
            return input.intValue();
        }
    }

    public void setOutput(Integer output) {
        this.output = output;
    }
}
