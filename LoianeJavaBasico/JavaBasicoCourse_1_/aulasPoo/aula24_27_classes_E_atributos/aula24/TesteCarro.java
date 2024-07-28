package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula24_27_classes_E_atributos.aula24;

public class TesteCarro {
    public static void main(String[] args) {
        Car van = new Car();
        van.marca               = "Fiat";
        van.modelo              = "Ducato";
        van.numPassageiros      = 10;
        van.capCombustivel      = 100;
        van.consumoCombustivel  = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
    }
}
