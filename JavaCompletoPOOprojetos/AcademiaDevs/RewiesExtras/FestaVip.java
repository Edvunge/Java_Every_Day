package JavaCompletoPOOprojetos.AcademiaDevs.RewiesExtras;

public class FestaVip {
    int quantidadeCafe = 30;
    int quantidadeSalgados = 50;

    void entrar() {
        beberCafe();
        comerSalgado();
        beberCafe();
    }
    void beberCafe() {
        quantidadeCafe--;
        System.out.println("Bebeu 1 xicara de cafe");
    }

    void comerSalgado() {
        quantidadeSalgados--;
        System.out.println("Comeu 5 salgados");
    }
}
