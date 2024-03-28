package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.O_Excecoes.test.runtime;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("/home/vunge/Documents/Java_Every_Day/arquivo/test.txt");
        boolean isCriado = file.createNewFile();
        System.out.println("Arquivo criado " + isCriado);
    }
}
