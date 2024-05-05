package geeksForGeeks.JavaCourse.Parte_5_String;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");

        String message = sb.toString();
        System.out.println(message);
    }
}
