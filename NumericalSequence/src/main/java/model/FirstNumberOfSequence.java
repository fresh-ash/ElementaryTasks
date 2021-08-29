package model;

public class FirstNumberOfSequence {

    Double input;
    Integer output;

    public FirstNumberOfSequence(Double input) {
        this.input = Math.sqrt(input);
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = Math.sqrt(input);
    }

    public Integer getOutput(){
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
