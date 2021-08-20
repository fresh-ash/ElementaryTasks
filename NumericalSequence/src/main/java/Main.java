import cli.CLI;
import controller.NumericalSequenceController;
import model.MagicNumber;
import util.MathOperations;
import view.NumericalSequenceView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumericalSequenceController controller = new NumericalSequenceController(new NumericalSequenceView(),
                                                new CLI(new Scanner(System.in)));
        controller.showWelcomeMessageAndStart();
    }
}
