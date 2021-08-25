import input.CLI;
import controller.EnvelopesAnalysisController;
import interfaces.Command;
import services.ValidatorEnvelopesAnalysisApp;
import view.ConsoleViewEnvelopesAnalysisApp;
import java.util.Scanner;

public class EnvelopesAnalysisMain implements Command {
    @Override
    public void runCommand() {
        EnvelopesAnalysisController controller = new EnvelopesAnalysisController(new ConsoleViewEnvelopesAnalysisApp(),
                new ValidatorEnvelopesAnalysisApp(), new CLI(new Scanner(System.in)));
        controller.showWelcomeMessAndStart();
    }

}
