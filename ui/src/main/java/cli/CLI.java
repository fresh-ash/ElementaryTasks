package cli;

import java.util.Scanner;

public class CLI {

    Scanner scanner;

    public CLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public String waitConsoleInput(String welcomeMessage){
        System.out.println(welcomeMessage);
        String str = scanner.nextLine();
        return str;
    }

    public boolean checkAnswer(String str) {
        String answer = waitConsoleInput(str);
        answer = answer.toLowerCase();
        if (answer.equals("y")  || answer.equals("yes")) return true;
        return false;
    }

}
