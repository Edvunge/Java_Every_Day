package LoianeJavaBasico.JavaBasicoCourse_1_.aulas;

public class ForEach {
    public static void main(String[] args) {
        // for each
        int[] notas = new int[10];

        notas[0] = 89;
        notas[1] = 88;
        notas[2] = 87;
        notas[3] = 86;
        notas[4] = 85;
        notas[5] = 84;
        notas[6] = 83;
        notas[7] = 82;
        notas[8] = 81;
        notas[9] = 18;

        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}
