package JavaCompletoPOOprojetos.AcademiaDevs.Parte_17_Entrada_E_Saida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerDeUmArquivo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Processar cada linha conforme necessário
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
