package model;

public class CustomerCountStrategy extends BaseCountStrategy{

    public CustomerCountStrategy() {
        predictFunction = (index, value)-> value%2 == 0;
    }
}
