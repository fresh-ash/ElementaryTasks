import input.CLI;
import controller.TriangleSortingAppController;
import service.ValidatorTriangleSortApp;
import view.ConsoleViewTrianglesSortApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TriangleSortingAppController appController = new TriangleSortingAppController(new ConsoleViewTrianglesSortApp(),
                new ValidatorTriangleSortApp(), new CLI(new Scanner(System.in)));
        appController.startApp();
    }
}
