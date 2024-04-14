package books.JavaComoProgramar_Deitel_editora.EntradaSaidaOperadores;

import java.util.Scanner;

public class ExercicioGeral05 {
    public static void main(String[] args){

        /*
        1. faca um algoritmo que leia o tempo de duracao de um evento em uma
    fabrica expressa em segundos e mostre-o expresso em horas , minutos e segundos.

      ex: o evento durou 3664segundos
      em horas seria xx
      em minutos seria yy
      em segundos seria zz

          conversão:
      segundos --->>>>> horas
      segundos --->>>>> minutos

      1 hora tem = 60 minutos
      1 minuto tem = 60 segundos
      1 hora tem = 3600 segundos

      segundosDigitados / 3600 = resultado

    */
        // Ddeclaração de variaveis
        int minutos = 60;
        Double segundosDigitados;
        Double resultado;
        Double resultadoFinal;

        Scanner input = new Scanner(System.in);

        System.out.print(" Qual Foi a Duracao do Evento? ");
        segundosDigitados  = input.nextDouble();

        // algoritmo para converter de segundos para horas
        resultado = segundosDigitados / 3600;

        // a expressao abaixo representa a conversao de decimal para minutos
        resultadoFinal =  resultado * minutos;

        System.out.println("o resultado final e : " + resultadoFinal+"minutos");
    }
}
