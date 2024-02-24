package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.A_IntroducaoClasses.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.A_IntroducaoClasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro mercedes = new Carro();
        mercedes.Modelo = "X50";
        mercedes.ano = 1995;
        mercedes.nome = "sportivo";

        Carro bmw = new Carro();
        bmw.Modelo = "Classe A ";
        bmw.ano = 1999;
        bmw.nome = "Executivo";

        System.out.println("Modelo: " + mercedes.Modelo);
        System.out.println("Ano: " + mercedes.ano);
        System.out.println("Nome: " + mercedes.nome);

        System.out.println("\n-----------------------------\n");

        System.out.println("Modelo: " + bmw.Modelo);
        System.out.println("Ano: " + bmw.ano);
        System.out.println("Nome: " + bmw.nome);


    }
}
