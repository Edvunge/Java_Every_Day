package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(8+66);
    }

    public void subtrairDoisNumeros(){
        System.out.println(183-66);
    }

    public void multiplicaDoisNumeros(int num, int num2){

        System.out.println(num*num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        } else {
            return num1/num2 ;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
