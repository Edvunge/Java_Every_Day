package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo;

public class TesteCarro {
    public static void main(String[] args) {
        Car van = new Car();
        van.marca = "fiat";
        van.modelo = "ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
    }
}
