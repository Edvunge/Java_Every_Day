package JavaCompletoPOOprojetos.AcademiaDevs.Parte_17_Entrada_E_Saida;

import java.io.InputStream;
import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        InputStream teclado = System.in;
        Scanner scanner = new Scanner(teclado);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
    }
}
