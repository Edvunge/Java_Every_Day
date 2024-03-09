package JavaNotesForProfessionals.cap_11_Strings;

import java.util.Scanner;

public class Alterando_Caracteres_Dentro_D_Uma_String {
    public static void main(String[] args) {
        String string = "This is a random String";
        String upper  = string.toUpperCase();
        String lower  = string.toLowerCase();

        System.out.println(string);  // resultado:  "This is a Random String"
        System.out.println(lower);   // resultado:  "this is a random string"
        System.out.println(upper);   // resultado:  "THIS IS A RANDOM STRING"

        // Alteração do caso de um carácter específico numa cadeia ASCII:
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String s = sc.next();

        char[] a = s.toCharArray();
        System.out.println("Enter the character you are looking for");
        System.out.println(s);

        String c = sc.next();
        char d = c.charAt(0);

        for (int i = 0; i <= s.length(); i++) {
            if (a[i] == d) {
                if (d >= 'a' && d <= 'z') {
                    d -= 32;
                } else if (d >= 'A' && d <= 'Z') {
                    d += 32;
                }
                a[i] = d;
                break;
            }
        }
        s = String.valueOf(a);
        System.out.println(s);
    }
}
