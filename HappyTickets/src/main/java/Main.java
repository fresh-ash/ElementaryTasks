import cli.CLI;
import controller.HappyTicketsController;
import view.HappyTicketsView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HappyTicketsController controller = new HappyTicketsController(new HappyTicketsView(), new CLI(new Scanner(System.in)));
        controller.showWelcomeMessAndStart();
    }
}
