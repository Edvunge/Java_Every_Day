package JavaNotesForProfessionals.cap_11_Strings;

import java.util.Locale;

public class Comparing_Strings {
    public static void main(String[] args) {
        /*
        String fristString = "Test123";
        String secondString = "Test" + 123;

        if (fristString.equals(secondString)) {
            // As duas Strings tem o mesmo conteudo.
        }
        */

        /*
        String fristString = "Test123";
        String secondString = "TEST123";

        if (fristString.equalsIgnoreCase(secondString)) {
            // As duas strings eram iguais, ignorando o caso individual de caracteres.
        }
        */
        String fristString  = "Taki";
        String secondString = "TAKI";

        System.out.println(fristString.equalsIgnoreCase(secondString)); // print true

        Locale locale = Locale.forLanguageTag("tr-TR");

        System.out.println(fristString.toLowerCase(locale).equals(secondString.toLowerCase(locale)));//prints false

        // Não usa os operadores == para comparar Strings

        // COMPARANDO STRINGS USANDO SWITCH CASE
        String stringToSwitch = "A";

        switch (stringToSwitch) {
            case "a":
                System.out.println("a");
                break;
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                break;
        }
        // Comparação com Strings internadas
        String strObj = new String("Hello!");
        String str = "Hello!";

        if (strObj.equals(str)) {
            System.out.println("The String are equal");
        }

        if (strObj != str) {
            System.out.println("The strings are not the same object");
        }

        String internerdStr = strObj.intern();

        if (internerdStr == str) {
            System.out.println("The interned string and the literal are the same object");
        }
    }
}
