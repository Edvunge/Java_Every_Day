package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.O_Excecoes.test.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }

    private static void criarNovoArquivo(){
        File file = new File("/home/vunge/Documents/Java_Every_Day/arquivo/test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
