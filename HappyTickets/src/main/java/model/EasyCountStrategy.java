package model;

public class EasyCountStrategy extends BaseCountStrategy {

    public EasyCountStrategy() throws IllegalArgumentException{
        predictFunction = (index, value)-> {
            if(index > 5) throw new IllegalArgumentException();
            return index > 2;
        };
    }
}
