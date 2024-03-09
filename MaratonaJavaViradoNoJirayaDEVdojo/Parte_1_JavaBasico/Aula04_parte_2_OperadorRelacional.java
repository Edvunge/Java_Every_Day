package MaratonaJavaViradoNoJirayaDEVdojo.Parte_1_JavaBasico;

public class Aula04_parte_2_OperadorRelacional {
    public static void main(String[] args) {
        // op relacional: < > <= >= !
        int num1 = 10;
        int num2 = 20;
        boolean resultado = num2 > num1 ;
        System.out.println(resultado);

        // op resto: %
        int resto = 21 % 8;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteQueVinte = 10 != 20;
        boolean isDezDiferenteQueDez = 10 != 10;

        System.out.println( "isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDiferenteQueVinte: " + isDezDiferenteQueVinte);
        System.out.println("isDezDiferenteQueDez: " + isDezDiferenteQueDez);
    }
}
