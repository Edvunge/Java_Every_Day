package ZEDlistaDEexercicios.NiumaAulas.PooBasico.test;

import ZEDlistaDEexercicios.NiumaAulas.PooBasico.dominio.Motorizada;

public class TestMotorizada {
    public static void main(String[] args) {
        Motorizada suzuki = new Motorizada();
        suzuki.cor = "preto";
        suzuki.marca = "bmw";
        suzuki.modelo = "X6";
        suzuki.ano = 2024;
        suzuki.nome = "motorizada";

        System.out.println(suzuki.nome);
    }
}
