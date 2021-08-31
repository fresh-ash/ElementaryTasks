import input.CLI;
import interfaces.Command;
import interfaces.Input;
import interfaces.Messages;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continueApp = true;
        Map<String, Command> applications = new HashMap<>();
        Input input = new CLI(new Scanner(System.in));
        applications.put("2", new EnvelopesAnalysisMain());
        applications.put("1", new ChessBoardMain());
        applications.put("3", new TriangleSortingMain());
        applications.put("6", new HappyTicketsMain());
        applications.put("4", new FileParserMain());
        applications.put("7", new NumericalSequenceMain());

        while (continueApp) {
            try {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                String consoleInput = input.waitInput(Messages.START_MAIN_MESSAGE);
                if (consoleInput.equals("0")){
                    break;
                }
                applications.get(consoleInput).runCommand();
            }
            catch (NullPointerException e){
                System.err.println(Messages.INCORRECT_INPUT);
            }
        }
    }
}
