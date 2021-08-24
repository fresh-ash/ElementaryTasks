import controller.ChessBoardController;
import input.CLI;
import interfaces.Command;
import view.ConsoleViewChessBoardApp;
import java.util.Scanner;

public class ChessBoardMain implements Command {

    @Override
    public void runCommand() {
        ChessBoardController boardController = new ChessBoardController(new ConsoleViewChessBoardApp(),
                                                    new CLI(new Scanner(System.in)));
        boardController.showWelcomeMessAndStartApp();
    }
}
