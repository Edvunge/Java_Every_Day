package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_1_JavaBasico;

public class Aula06_parte_2_EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 até 1000000
        int count = 1000000;

        for (int j = 0; j < count; j++) {
            if(j % 2 == 0) {
                System.out.printf(" %d \n" , j);
            }
        }
    }
}
