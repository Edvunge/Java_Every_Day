package AulasDoYoutube.broCode.oop.javaCourse2023.part00_exercs.exerc02_overloadedMethods;

public class Impressora {
    /*
    Crie uma classe `Impressora` com métodos sobrecarregados `imprimir` para imprimir uma `String`,
    um `int` e um `double`. Teste todos os métodos no `main`.
    */
    void imprimir(String texto) {
        System.out.println(texto);
    }

    void imprimir(int num) {
        System.out.println(num);
    }

    void imprimir(double numDouble) {
        System.out.println(numDouble);
    }
}
