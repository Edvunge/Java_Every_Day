package Projects.fase_2.multibanco;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 1234;

        /*

        quero que o programa peca uma senha e que verifique
        caso essa senha seje igual a um determinado pin,
       

        */
        //do {
            for (int i = 1; i < 4; i++) {

                System.out.printf("%d - tentativa: Digite o seu pin: ", i);
                int x = input.nextInt();

                if (pin == 1234) {
                    System.out.println("!!!! - PIN CORRETO - !!!!");
                    break;
                }
                System.out.println("Rodou: ");
            }
       // } while ();
        System.out.println(" FIM!!! ");

    }
}
