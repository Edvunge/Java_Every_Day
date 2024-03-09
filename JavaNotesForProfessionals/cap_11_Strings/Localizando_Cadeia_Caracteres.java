package JavaNotesForProfessionals.cap_11_Strings;

public class Localizando_Cadeia_Caracteres {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello";
        String str3 = "helLO";

        System.out.println(str1.contains(str2)); //prints true
        System.out.println(str1.contains(str3)); //prints false

        String s = "this is a long sentence";
        int i = s.indexOf('i');
        int j = s.indexOf("long");
        int k = s.indexOf('z');
        int h = s.indexOf("LoNG");

        str1 = "Hello World";
        str2 = "w0r";
        str1.indexOf(str2);
        str1.toLowerCase().contains(str2.toLowerCase());
        str1.toLowerCase().indexOf(str2.toLowerCase());
    }
}
