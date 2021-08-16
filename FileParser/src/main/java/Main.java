import service.FileIOService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(FileIOService.readFileAsString("C:/Program Files/Google/Chrome/Application/master_preferences"));

        }
        catch (IOException e){
            e.getMessage();
        }
        }
}
