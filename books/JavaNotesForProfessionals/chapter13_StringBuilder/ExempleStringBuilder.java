package books.JavaNotesForProfessionals.chapter13_StringBuilder;

public class ExempleStringBuilder {
    public static void main(String[] args) {
        int one = 1;
        String color = "red";
        StringBuilder sb = new StringBuilder();
        sb.append("One=").append(one).append(", Color=").append(color).append('\n');
        System.out.print(sb);
    }
}
