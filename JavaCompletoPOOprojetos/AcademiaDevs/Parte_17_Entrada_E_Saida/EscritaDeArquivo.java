package JavaCompletoPOOprojetos.AcademiaDevs.Parte_17_Entrada_E_Saida;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class EscritaDeArquivo {
    public static void main(String[] args) throws IOException {
        FileOutputStream arquivo = new FileOutputStream("entrada.txt");
        PrintStream printStream = new PrintStream(arquivo);

        printStream.println("Primeira linha!!!");
        printStream.println("Segunda linha!!!");
        printStream.println("Terceira linha!!!");
    }
}
