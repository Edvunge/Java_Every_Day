package sites.devJava.basicJava.varTypeIdentifier;

import java.util.List;

public class VarExample {
    public static void main(String[] args) {
        var list = List.of("one", "two", "three", "four");
        for (var element : list) {
            System.out.println(element);
        }
    }
}
