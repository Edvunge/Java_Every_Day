package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc12 {
    // 12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
    //qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
    //numero ele deseja ver a tabuada. A saída deve ser conforme o
    //exemplo abaixo:
    // 7 x 6 = 42
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o numero que quer descubrir a tabuda: ");
        int num = input.nextInt();

        for ( int i = 1; i <= 10; i++){
            System.out.printf(" %d x %d = %d \n",i ,num ,i*num);
        }
        input.close();
    }
}
