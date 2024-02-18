package Java_COMPLETO_POO_Projetos.Exercicios;

public class TestaCirculoAndCircuferencia {
    public static void main(String[] args) {
        // calcular a area do circulo
        CirculoAndCircunferencia_cls circulo = new CirculoAndCircunferencia_cls();
        circulo.raio = 2.3;

        double circ = circulo.calcularAreaDoCirculo(4.5);
        System.out.format("\nA area do circulo e de: %.2f",circ);

        // calcular a area da circunferencia do circulo
        CirculoAndCircunferencia_cls circuferencia = new CirculoAndCircunferencia_cls();
        circuferencia.raio = 3.4;

        double circunf = circuferencia.calcularAreaDaCircunferenciaDoCirculo(6.5);
        System.out.format("\nA area da circunferencia do circulo e de: %.2f",circunf);
    }
}
