package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula32_gets_and_sets;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.setModelo("Ducato");

        System.out.println(van.getModelo());
    }
}
