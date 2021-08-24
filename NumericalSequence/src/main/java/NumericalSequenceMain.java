import input.CLI;
import controller.NumericalSequenceController;
import interfaces.Command;
import view.NumericalSequenceView;

import java.util.Scanner;

public class NumericalSequenceMain implements Command {

    @Override
    public void runCommand() {
        NumericalSequenceController controller = new NumericalSequenceController(new NumericalSequenceView(),
                new CLI(new Scanner(System.in)));
        controller.showWelcomeMessageAndStart();
    }
}
