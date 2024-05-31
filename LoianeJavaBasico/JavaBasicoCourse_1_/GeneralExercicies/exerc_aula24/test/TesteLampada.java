package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.test;


import LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.dominio.Lampada;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "circular";
        lampada.volts = 2.34;
        lampada.potencia = "maxima";

        System.out.println(lampada.modelo);
        System.out.println(lampada.volts);
        System.out.println(lampada.potencia);
    }
}
