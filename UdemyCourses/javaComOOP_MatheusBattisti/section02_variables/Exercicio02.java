package UdemyCourses.javaComOOP_MatheusBattisti.section02_variables;

public class Exercicio02 {
    /*
            EXERCICIO 2:

            Declare uma variavel char que armazena a letra 'B'.
            Faça o casting explicito dessa variavel para int e exiba o valor númerico correspondente
    */
    public static void main(String[] args) {
        char b = 'B';
        int valorInt = (int) b;

        System.out.println("O valor correspondente: " + valorInt);
    }
}
