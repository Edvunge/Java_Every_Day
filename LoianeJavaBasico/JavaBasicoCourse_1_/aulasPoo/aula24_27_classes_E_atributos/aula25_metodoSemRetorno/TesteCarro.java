package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula24_27_classes_E_atributos.aula25_metodoSemRetorno;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();
    }
}
