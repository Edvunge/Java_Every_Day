package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc24 {
    // 24. Faça um algoritmo que leia a velocidade de um veículo em km/h e calcule e
    // imprima a velocidade em m/s (metros por segundo).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a velocidade de um veiculo: ");
        double velocidade = input.nextDouble();

        double conversor = (velocidade/3.6);
        System.out.printf("Valor em m/s: %.f",conversor);
        input.close();
    }
}
