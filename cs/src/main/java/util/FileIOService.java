package util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOService {

    public static StringBuilder readFileAsString(String fileName) throws IOException {

        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        StringBuilder data = new StringBuilder();
        while (scanner.hasNextLine()) {
            data.append(scanner.nextLine());
        }
        fileReader.close();
        return data;
    }

    public static void writeToFile(String writeData, String fileName) throws IOException{
        FileWriter fileWriter = new FileWriter(fileName);

    }

}
