package AulasDoYoutube.broCode.oop.part00_exercs.exerc02_overloadedMethods;

public class Calculadora {
    /*
    Crie uma classe `Calculadora` com métodos sobrecarregados `somar` para somar dois números inteiros,
    dois números de ponto flutuante e três números inteiros. Teste todos os métodos no `main`.
    */
    void somar(int num1, int num2) {
        int soma = num1 + num2 + 78;
        System.out.println(" Soma " + soma);
    }

    void somar(float num1, float num2, int num3, int num4) {
        float soma = num1 + num2 + num3 + num4;
        System.out.println(" Soma " + soma);
    }
}
