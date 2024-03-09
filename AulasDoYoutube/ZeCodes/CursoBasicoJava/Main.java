package AulasDoYoutube.ZeCodes.CursoBasicoJava;

import java.util.Date; // isto é o exemplo do import de uma determinada classe

public class Main {
    // declaração dos tipos de variaveis:
    String carteira = "dinheiro";
    int idade = 78;
    double altura = 1.90;
    float peso = 34.5f;
    boolean isAdult = true;
    char caracter = 'A';
    final double PI = 3.141516; // esta é a forma de se criar uma constante

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Date date = new Date();

        // OPERADORES ARITMETICOS
        int dez = 10;
        int cinco = 5;
        int soma = dez + cinco;

        System.out.printf("\nsoma: %d +  %d = %d  ",dez ,cinco ,soma);

        System.out.printf("\n10 + 5 = %d ",10 + 5);
        System.out.printf("\n10 - 5 = %d ",10 - 5);
        System.out.printf("\n10 * 5 = %d ",10 * 5);
        System.out.printf("\n10 / 5 = %d \n",10 / 5);

        // OPERADORES DE COMPARACAO
        int minhaIdade = 23;
        int suaIdade = 21;
        System.out.println(minhaIdade > suaIdade);
        System.out.println(minhaIdade >= suaIdade);
        System.out.println(minhaIdade < suaIdade);
        System.out.println(minhaIdade <= suaIdade);
        System.out.println(minhaIdade == suaIdade);
        System.out.println(minhaIdade != suaIdade);

        // OPERADORES LOGICOS
        boolean ehAdulto = true;
        boolean ehEstudante = false;
        boolean ehVoceJaPagou = true;

        System.out.println(ehAdulto && ehEstudante);
        System.out.println( (ehEstudante  || ehEstudante) && ehVoceJaPagou);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
    }

    // os nomes das classes começam em maiusculas, seguindo o sistema PascalCase
    // pacotes, classes etc.

    /**
     * javaDocs
     * @author edvaldo vunge
     * @since 2024
     */









}
