package Java_COMPLETO_POO_Projetos.Exercicios;

public class TestaCarro {
    public static void main(String[] args) {
        Carro_cls carro = new Carro_cls();
        carro.modelo = "Talisman";
        carro.cor = "preto";
        carro.ano = 2002;

        carro.informacoesCarro(carro.modelo, carro.cor, carro.ano);
    }
}