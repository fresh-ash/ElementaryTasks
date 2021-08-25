package model;

public class MagicNumber {

    Double input;
    Integer output;

    public MagicNumber(Double input) {
        this.input = Math.abs(input);
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = Math.abs(input);
    }

    public Integer getOutput() {
        output = input.intValue();
        if(input > output){
            output += 1;
        }
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }
}
