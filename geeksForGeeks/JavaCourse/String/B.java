package geeksForGeeks.JavaCourse.String;

public class B {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Hello");

        System.out.println(sb.capacity());
        sb.append("java is my favorite language");
        System.out.println(sb.capacity());
    }
}
