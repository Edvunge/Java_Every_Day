package JavaNotesForProfessionals.cap11_Strings;

public class Substrings {
    public static void main(String[] args) {
        String s = "this is an example";
        String a = s.substring(11);
        String b2 = s.substring(5, 10);
        String b = s.substring(5, b2.length()-3);


        String datestring = "2015年11月17日";
        datestring = datestring.substring(0, 4) + "-" + datestring.substring(5,7) + "-" + datestring.substring(8,10);
    }
}