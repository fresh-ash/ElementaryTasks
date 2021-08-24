import input.CLI;
import controller.HappyTicketsController;
import interfaces.Command;
import view.HappyTicketsView;

import java.util.Scanner;

public class HappyTicketsMain implements Command {

    @Override
    public void runCommand() {
        HappyTicketsController controller = new HappyTicketsController(new HappyTicketsView(), new CLI(new Scanner(System.in)));
        controller.showWelcomeMessAndStart();
    }
}
