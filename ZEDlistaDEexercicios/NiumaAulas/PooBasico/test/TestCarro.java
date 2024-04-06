package ZEDlistaDEexercicios.NiumaAulas.PooBasico.test;

import ZEDlistaDEexercicios.NiumaAulas.PooBasico.dominio.Carro;

public class TestCarro {
    public static void main(String[] args) {
        Carro bmw = new Carro();
        bmw.cor = "preto";
        bmw.marca = "bmw";
        bmw.modelo = "X6";
        bmw.ano = 2024;


        System.out.println("cor do carro: " + bmw.cor);
    }
}
