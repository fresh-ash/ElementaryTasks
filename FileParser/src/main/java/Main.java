import cli.CLI;
import controller.FileParserController;
import util.FileIOService;
import service.StringManager;
import view.ConsoleViewFileParser;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileParserController controller = new FileParserController(new ConsoleViewFileParser(), new CLI(new Scanner(System.in)));
            controller.startFileParserApp();
        }
        catch (IOException e){
            e.getMessage();
        }
        }
}
