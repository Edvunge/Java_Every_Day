package geeksForGeeks.JavaCourse.String;

public class AAa {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.replace(1, 3, "java");
        System.out.println(sb);
    }
}