import controller.ChessBoardController;
import services.ValidatorChessBoardApp;
import view.ConsoleViewChessBoardApp;
import view.IViewChessBoardApp;


public class Main {

    public static void main(String[] args) {
        ValidatorChessBoardApp validator = new ValidatorChessBoardApp();
        IViewChessBoardApp view = new ConsoleViewChessBoardApp();
        ChessBoardController boardController = new ChessBoardController(view, validator);
        boardController.startChessBoardApp(args);
    }
}
