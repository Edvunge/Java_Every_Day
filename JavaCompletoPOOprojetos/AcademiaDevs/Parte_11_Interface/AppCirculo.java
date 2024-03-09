package JavaCompletoPOOprojetos.AcademiaDevs.Parte_11_Interface;

public class AppCirculo {
    public static void main(String[] args) {
        // Encapsulamento -> Interface
        Circulo circulo = new Circulo(2);
        System.out.println(circulo.calcularArea());

        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.calcularArea());
    }
}
