package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.O_Excecoes.test.runtime;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
