package MaratonaJAVA_DEVdojo.Exercicios.Controle_de_fluxo;

import java.util.Random;
import java.util.Scanner;

public class JogoDaForcaSimples {
    // Jogo da Forca Simples:
    //	Implemente um jogo da forca com uma palavra fixa.
    //	O usuário tem um número limitado de tentativas para adivinhar a palavra.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("=====================================================");
        System.out.println("================|  JOGO DA FORCA  |==================");
        System.out.println("=====================================================");
        System.out.println("=====================================================");

        System.out.println("\n");
        // Array de letras do alfabeto
        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        /*for (int i = 0; i < 26; i++){
            System.out.println("  " + alfabeto[i]);
        }*/

        // Número de letras a serem retiradas aleatoriamente
        int numeroDeLetras = 5;

        // Criando uma instância da classe Random
        Random random = new Random();

        // Retirando letras aleatórias
        for (int i = 0; i < numeroDeLetras; i++) {
            int indiceAleatorio = random.nextInt(alfabeto.length);
            char letraRetirada = alfabeto[indiceAleatorio];

            // Exibindo a letra retirada
            System.out.print(letraRetirada);

            // Removendo a letra do array (opcional, dependendo do que você deseja fazer)
            // Isso cria um novo array sem a letra retirada
            alfabeto = removerElemento(alfabeto, indiceAleatorio);
        }

        sc.close();
    }

    // Método para remover um elemento de um array
    private static char[] removerElemento(char[] array, int indice) {
        char[] novoArray = new char[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indice) {
                novoArray[j++] = array[i];
            }
        }
        return novoArray;
    }
}