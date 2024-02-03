package Java_COMPLETO_POO_Projetos.Exercicios;

public class Retangulo_cls {
    /*
    1. Crie uma classe `Retangulo` com atributos comprimento e largura.
        Adicione um método para calcular a área do retângulo.
    */
        double comprimento;
        double largura;
        // AREA = COMP X LARGURA

        double calcularAreaDoRetangulo(double largura, double comprimento) {
            double areaDoRetangulo;
            areaDoRetangulo = (largura * comprimento);
            return areaDoRetangulo;
        }
}
