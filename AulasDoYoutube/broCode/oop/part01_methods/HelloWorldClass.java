package AulasDoYoutube.broCode.oop.part01_methods;

public class HelloWorldClass {
    public static void main(String[] args) {
        String name = "Bro";
        int age = 21;
        hello(name, age);
    }

    static void hello(String title, int idade) {
        System.out.println("Hello " + title + " my Age: " + idade);
    }
}
