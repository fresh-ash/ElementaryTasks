package interfaces;

import java.util.Arrays;

public interface Input {

    String waitInput(String welcomeMessage);
    boolean checkAnswer(String str);

    static String[] splitInput(String str, String regex){
        String[] inputData = Arrays.stream(str.split(regex))
                .map(String::trim)
                .toArray(String[]::new);
        return inputData;
    }
}
