package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_17_Entrada_E_Saida;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LeituraDeArquivo {
    public static void main(String[] args) throws IOException {
        InputStream arquivo = new FileInputStream("entrada.txt");
        Scanner scanner = new Scanner(arquivo);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
    }
}
