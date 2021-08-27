package model;

public class EasyCountStrategy extends BaseCountStrategy {

    public EasyCountStrategy() {
        function = (index, value)-> index > 2;
    }
}
