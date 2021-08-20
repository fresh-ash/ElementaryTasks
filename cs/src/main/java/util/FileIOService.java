package util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOService {

    public static String readFileAsString(String fileName) throws IOException {

        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        String data = new String();
        while (scanner.hasNextLine()) {
            data += (scanner.nextLine()) + "\n";
        }
        fileReader.close();
        return data;
    }

    public static void writeToFile(String writeData, String fileName) throws IOException{
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(writeData);
        fileWriter.close();
    }

}
