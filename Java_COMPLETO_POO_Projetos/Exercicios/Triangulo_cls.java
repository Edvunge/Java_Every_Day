package Java_COMPLETO_POO_Projetos.Exercicios;

public class Triangulo_cls {
    /*
    7. Crie uma classe `Triangulo` com atributos base e altura.
    Adicione um método para calcular a área do triângulo.
    */
    public double base_b;
    public double altura_h;

    // area = base*altura/2
    double calcularAreaDoTriangulo(double base_b, double altura_h){
        double areaDoTriangulo = (base_b * altura_h)/2;
        return areaDoTriangulo;
    }

    public static void main(String[] args) {
        Triangulo_cls triangulo = new Triangulo_cls();
        triangulo.base_b = 2.3;
        triangulo.altura_h = 12.2;

        double calcTriangulo = triangulo.calcularAreaDoTriangulo(triangulo.base_b, triangulo.altura_h);
        System.out.format("O valor da area do triangulo: %.2f",calcTriangulo);
    }
}
