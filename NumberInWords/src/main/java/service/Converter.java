package service;

import interfaces.Messages;
import model.NumberInWords;

public class Converter {

    String getRanges(int number){
        String str = "";
        if (number/100 >= 1){
            str += Messages.FIRST_RANGE[number/100 - 1] +" "+ Messages.RANGES[2] + " ";
            int temp = number%100;
            if (temp > 19){
                str += Messages.SECOND_RANGE[temp/10 - 2];
                if(temp%10 != 0){
                    str += "-" + Messages.FIRST_RANGE[temp%10 - 1 ] ;
                }
            }
            else if(temp > 9){
                str += Messages.FIRST_RANGE[number%100 - 1];
            }
            else if(temp > 0){
                str += "and " + Messages.FIRST_RANGE[temp - 1];
            }
        }
        else if (number/10 > 1){
            str += Messages.SECOND_RANGE[number/10 - 2];
        }
        else if (number > 0){
            str += Messages.FIRST_RANGE[number - 1];
        }
        return str;
    }

    public NumberInWords getNumberInWords(int number){
        NumberInWords numberInWords = new NumberInWords(Math.abs(number));
        if (number < 0){
            numberInWords.setMinus(true);
            number = Math.abs(number);
        }
        if (number >= 1000000){
            numberInWords.setMillions(getRanges(number/1000000));
            numberInWords.setThousands(getRanges(number%1000000/1000));
            numberInWords.setHundreds(getRanges(number%1000000%1000));
        }
        else if(number >= 1000 && number < 1000000){
            numberInWords.setThousands(getRanges(number/1000));
            numberInWords.setHundreds(getRanges(number%1000));
        }
        else {
            numberInWords.setHundreds(getRanges(number));
        }
        return numberInWords;
    }

}
