package model;

public class EasyCountStrategy extends BaseCountStrategy {

    public EasyCountStrategy() {
        predictFunction = (index, value)-> index > 2;
    }
}
