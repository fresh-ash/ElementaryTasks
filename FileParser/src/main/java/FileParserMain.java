import input.CLI;
import controller.FileParserController;
import interfaces.Command;
import view.ConsoleViewFileParser;

import java.io.IOException;
import java.util.Scanner;

public class FileParserMain implements Command {

    @Override
    public void runCommand() {
        try {
            FileParserController controller = new FileParserController(new ConsoleViewFileParser(), new CLI(new Scanner(System.in)));
            controller.startFileParserApp();
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
