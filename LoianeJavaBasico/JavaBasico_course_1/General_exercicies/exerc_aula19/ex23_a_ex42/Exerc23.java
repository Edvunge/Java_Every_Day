package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19.ex23_a_ex42;

public class Exerc23 {
    /*
        23.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
        que verifique se "todos" os elementos do vetor A são pares. Se pelo
        menos um elemento do vetor não for par o processo de repetição para
        percorrer os elementos do vetor deve ser encerrado, como sugestão:
        utilize uma variável do tipo flag para atingir este propósito.
    */
    public static void main(String[] args) {
        int lengthARRAY = 10;
        int vetA[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int numPares = 0;

        for (int i = 0; i < lengthARRAY; i++) {
            if(vetA[i] % 2 == 0) {
                numPares++;
            } else {
                break;
            }
        }
    }
}