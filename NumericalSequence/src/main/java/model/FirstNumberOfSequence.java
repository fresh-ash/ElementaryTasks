package model;

public class FirstNumberOfSequence {

    Double input;
    Integer output;

    public FirstNumberOfSequence(Double input) {
        this.input = input;
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = Math.abs(input);
    }

    public Integer getOutput() throws IllegalArgumentException{
        if (input < 0){
            throw new IllegalArgumentException();
        }
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
