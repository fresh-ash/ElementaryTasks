import input.CLI;
import controller.TriangleSortingAppController;
import interfaces.Command;
import service.ValidatorTriangleSortApp;
import view.ConsoleViewTrianglesSortApp;

import java.util.Scanner;

public class TriangleSortingMain implements Command {

    @Override
    public void runCommand() {
        TriangleSortingAppController appController = new TriangleSortingAppController(new ConsoleViewTrianglesSortApp(),
                new ValidatorTriangleSortApp(), new CLI(new Scanner(System.in)));
        appController.startApp();
    }
}
