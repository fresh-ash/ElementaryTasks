package model;

public class EasyCountStrategy extends BaseCountStrategy {

    public EasyCountStrategy(){
        predictFunction = (index, value)-> {
            if(index > 5) throw new IllegalArgumentException("Very long number!");
            return index > 2;
        };
    }
}
