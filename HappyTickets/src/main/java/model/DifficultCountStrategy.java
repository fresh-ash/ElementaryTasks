package model;

public class DifficultCountStrategy extends BaseCountStrategy {

    public DifficultCountStrategy() {
        function = (index, value)-> index%2 == 0;
    }

}
