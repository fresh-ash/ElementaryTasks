import service.Converter;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Stream.of(1,2,3,4,5,6,7).filter(x -> x%2 != 0).reduce((x,y) -> x+y));
    }
}
