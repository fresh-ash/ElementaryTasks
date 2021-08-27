import service.Converter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println(converter.convert(-0));
        System.out.println(converter.convert(-2000002305));
    }
}
