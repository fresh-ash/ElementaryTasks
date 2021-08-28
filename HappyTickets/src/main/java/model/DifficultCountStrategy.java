package model;

public class DifficultCountStrategy extends BaseCountStrategy {

    public DifficultCountStrategy() {
        predictFunction = (index, value)-> index%2 == 0;
    }

}
