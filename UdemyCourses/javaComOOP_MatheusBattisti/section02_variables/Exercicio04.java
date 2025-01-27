package UdemyCourses.javaComOOP_MatheusBattisti.section02_variables;

public class Exercicio04 {
    /*
    EXERCICIO 4:

            Declare uma variavel long para armazenar o numero 2 bilhoes (2_000_000_000).
            Em seguida, declare uma variavel int e faça o casting explicito do valor long para int.
            Exiba o resultado
    */
    public static void main(String[] args) {
        long number = 2_000_000_000;
        int number2 = (int) number;

        System.out.println("The number: " + number);
        System.out.println("= = = = = = = = = = = = ");
        System.out.println("The number2: " + number2);
    }
}
