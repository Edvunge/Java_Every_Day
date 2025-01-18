package books.JavaNotesForProfessionals.chapter11_Strings.section11_8_Substrings;

public class DateString {
    public static void main(String[] args) {
        String datestring = "2015年11月17日";
        datestring = datestring.substring(0, 4) + "-" + datestring.substring(5, 7) + "-" + datestring.substring(8, 10);
        System.out.println(datestring);
    }
}
