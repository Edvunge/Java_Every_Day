package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula34_metodosEstaticos;

public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args) {

       resultSoma = MinhaCalculadora.soma(1, 3);

    }

    static int soma2Valores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }
}
