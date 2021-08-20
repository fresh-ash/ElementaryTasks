package cli;

import interfaces.Input;
import java.util.Scanner;

public class CLI implements Input{

    Scanner scanner;

    public CLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public String waitInput(String welcomeMessage){
        System.out.println(welcomeMessage);
        String str = scanner.nextLine();
        return str;
    }

    public boolean checkAnswer(String str) {
        String answer = waitInput(str);
        answer = answer.toLowerCase();
        if (answer.equals("y")  || answer.equals("yes")) return true;
        return false;
    }



}
