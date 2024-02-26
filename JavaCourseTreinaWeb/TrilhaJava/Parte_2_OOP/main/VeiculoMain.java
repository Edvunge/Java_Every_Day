package JavaCourseTreinaWeb.TrilhaJava.Parte_2_OOP.main;

import JavaCourseTreinaWeb.TrilhaJava.Parte_2_OOP.Classes.Veiculo;

public class VeiculoMain {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.nome = "carro";
        veiculo.marca = "Mercedes";
        veiculo.quantidadRodas = 4;
        veiculo.chassi = "sem chassi";

        veiculo.ligar();
        veiculo.desligar();
    }
}
