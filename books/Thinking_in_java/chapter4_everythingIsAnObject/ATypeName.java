package books.Thinking_in_java.chapter4_everythingIsAnObject;

public class ATypeName {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;

        System.out.println("variable I: " + data.i);
        System.out.println("variable D: " + data.d);
        System.out.println("variable B: " + data.b);
    }
}
