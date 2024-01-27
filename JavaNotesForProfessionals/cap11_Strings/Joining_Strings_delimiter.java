package JavaNotesForProfessionals.cap11_Strings;

public class Joining_Strings_delimiter {
    public static void main(String[] args) {
        String[] elemets = {"foo", "bar", "foobar" };
        String singleString = String.join(" + ", elemets);

        System.out.println(singleString);
    }
}
