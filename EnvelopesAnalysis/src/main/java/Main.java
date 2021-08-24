import input.CLI;
import controller.EnvelopesAnalysisController;
import services.ValidatorEnvelopesAnalysisApp;
import view.ConsoleViewEnvelopesAnalysisApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EnvelopesAnalysisController controller = new EnvelopesAnalysisController(new ConsoleViewEnvelopesAnalysisApp(),
                new ValidatorEnvelopesAnalysisApp(), new CLI(new Scanner(System.in)));
        controller.getDataAndShow();
    }
}
