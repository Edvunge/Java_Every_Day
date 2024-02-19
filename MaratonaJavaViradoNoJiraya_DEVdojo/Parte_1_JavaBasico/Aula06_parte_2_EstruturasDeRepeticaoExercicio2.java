package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_1_JavaBasico;

public class Aula06_parte_2_EstruturasDeRepeticaoExercicio2 {
    // exibir os primeiros 25 de 50 numeros
    public static void main(String[] args) {
        int count = 50;

        for (int j = 0; j < count; j++) {
            if(j > 25 ) {
                break;
            }
            System.out.printf(" %d \n",j);
        }
    }
}
