package books.JavaNotesForProfessionals.chapter13_StringBuilder;

public class StringJoiner {
    public StringJoiner(String s, String s1, String s2) {

    }

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (String s : new String[]{"A", "B", "C"}) {
            sj.add(s);
        }
        System.out.println(sj);
    }

    private void add(String s) {

    }
}
