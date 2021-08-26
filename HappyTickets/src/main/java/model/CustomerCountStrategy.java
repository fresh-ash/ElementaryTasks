package model;

public class CustomerCountStrategy extends BaseCountStrategy{

    public CustomerCountStrategy() {
        function = (index, value)-> value%2 == 0;
    }
}
