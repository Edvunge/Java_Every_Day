package UdemyCourses.javaComOOP_MatheusBattisti.section02_variables;

public class Exercicio05 {
    /*
     EXERCICIO 5:

            Escreva um programa que crie uma variavel String com o valor "Olá, Mundo!".
            Em seguida, crie outra variavel String que concatene a primeira variavel com o texto
            " BEM-VINDO ao Java!".
            Exiba o resultado
    */
    public static void main(String[] args) {
        String texto = "Olá, Mundo! ";
        String umOutroTexto = texto + " BEM-VINDO ao Java!";

        System.out.println(texto);
        System.out.println("= = = = = = = = = = = = = = = = ");
        System.out.println(umOutroTexto);
    }
}
