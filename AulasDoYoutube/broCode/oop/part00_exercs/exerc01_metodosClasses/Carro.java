package AulasDoYoutube.broCode.oop.part00_exercs.exerc01_metodosClasses;

public class Carro {

    public boolean status;

    /*
    Exercício 1:
    Crie uma classe `Carro` com métodos para ligar o carro, desligar o carro e verificar o status do carro (ligado/desligado).
    Implemente um método `main` para testar essas funcionalidades.
    */

    void ligarCarro() {
        if (status == true)
            System.out.println(". . . Carro Ligado . . .");
    }

    void desligarCarro() {
        if (status == false)
            System.out.println(". . . Carro Desligado . . .");
    }
}
