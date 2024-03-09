package JavaCompletoPOOprojetos.Exercicios;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo_cls ret = new Retangulo_cls();
        ret.comprimento = 2.3;
        ret.largura = 1.2;

        double areaRetangulo = ret.calcularAreaDoRetangulo(ret.largura, ret.comprimento);
        System.out.format("A area de um retangulo: %.2f",areaRetangulo);
    }
}