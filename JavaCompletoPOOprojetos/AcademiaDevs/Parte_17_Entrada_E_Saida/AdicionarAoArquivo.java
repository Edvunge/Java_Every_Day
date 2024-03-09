package JavaCompletoPOOprojetos.AcademiaDevs.Parte_17_Entrada_E_Saida;

import java.io.FileWriter;
import java.io.IOException;

public class AdicionarAoArquivo {

        public static void main(String[] args) {
            try (FileWriter writer = new FileWriter("arquivo.txt", true)) {
                // Adicionar conteúdo ao final do arquivo
                writer.write("\nEsta linha será adicionada ao arquivo existente.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
