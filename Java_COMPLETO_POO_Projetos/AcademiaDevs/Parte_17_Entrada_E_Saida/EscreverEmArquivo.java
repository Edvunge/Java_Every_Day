package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_17_Entrada_E_Saida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverEmArquivo {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo.txt"))) {
            // Escrever no arquivo
            writer.write("Olá, Mundo!");
            writer.newLine();  // Adicionar uma nova linha
            writer.write("Este é um exemplo de escrita em arquivo em Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
