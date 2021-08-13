package cli;

import input.IInputService;

import java.util.Scanner;

public class CLI implements IInputService {

    Scanner scanner;

    public CLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public String waitConsoleInput(String welcomeMessage){
        System.out.println(welcomeMessage);
        String str = scanner.next();
        return str;
    }

}
