package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_17_Entrada_E_Saida;

import java.io.*;
import java.util.Scanner;

public class TestaLeituraConteudo {
    public static void main(String[] args) throws IOException {
        try (InputStream arquivoEntrada = new FileInputStream("entrada.txt");
             Scanner scanner = new Scanner(arquivoEntrada);
             FileOutputStream arquivoNovo = new FileOutputStream("TestaLeituraConteudo.txt");
             PrintStream printStream = new PrintStream(arquivoNovo)) {

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                // Realize alguma lógica com a linha, se necessário
                printStream.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
