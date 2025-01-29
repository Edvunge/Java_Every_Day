package UdemyCourses.javaComOOP_MatheusBattisti.section04_condicionais;

import java.util.Scanner;

public class Exercicio06_classificacaoDeLetra {
    /*
    Exercicio 6: Classificação de Letra

    Peça ao usuario para inserir uma letra.
    Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante.
    Exiba "Vogal" ou "Consoante" de acordo com a entrada.
    Considere tanto letras maiusculas quanto minusculas.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma letra: ");
        String letra = input.next();

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("EH UMA VOGAL");
                break;
            case "b": case "c": case "d": case "f": case "g":
            case "h": case "j": case "k": case "l": case "m":
            case "n": case "p": case "q": case "r": case "s":
            case "t": case "v": case "x": case "y": case "w":
            case "z":
                System.out.println("EH UMA CONSOANTE");
                break;
        }
    }
}
