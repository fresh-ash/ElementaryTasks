import service.Converter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
         System.out.println(converter.getNumberInWords(-345653202).toString());
    }
}
