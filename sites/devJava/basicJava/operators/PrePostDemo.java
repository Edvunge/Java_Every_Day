package sites.devJava.basicJava.operators;

public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println("i: " + i);

        ++i;
        System.out.println("++ i: "+ i);

        System.out.println("++i: "+ ++i);
        System.out.println("i++: "+ i++);
        System.out.println("i: " + i);
    }
}
