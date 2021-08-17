package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManager {

    public static int countStrings(String str, String substring){
        int counter = 0;
        Pattern pattern = Pattern.compile(substring);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            counter++;
        }
        return counter;
    }


}
