package service;

import interfaces.Messages;

public class Converter {

    private String convertTriplex(int number) {
        String current;
        if (number % 100 < 20){
            current = Messages.FIRST_RANGE[number % 100];
            number /= 100;
        }
        else {
            current = Messages.FIRST_RANGE[number % 10];
            number /= 10;

            current = Messages.SECOND_RANGE[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return Messages.FIRST_RANGE[number] + " hundred" + current;
    }

    public String convert(int number) {
        if (number == 0) { return "zero"; }
        String prefix = "";
        if (number < 0) {
            number = -number;
            prefix = "minus";
        }
        String current = "";
        int place = 0;
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertTriplex(n);
                current = s + Messages.RANGES[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        return (prefix + current).trim();
    }
}
