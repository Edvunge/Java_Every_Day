package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.exercs.dominio;

public class Lampada {
    // 1. Escreva uma classe para representar uma lampada. Desenvolva métodos para ligar, desligar a lampada.

    // = = = = = = =  atributos = = = = = = =
    public boolean acessa;
    public double tamanho;
    public double voltagem;
    public double largura;
    public int centimetrosCM;
    public String marca;
    public String modelo;
    public int valor;

    // = = = = = = =  metodos  = = = = = = =
    void ligarLampada() {
        if (acessa) {
            System.out.println("Lampada Ligada");
        }
    }

    void desligarLampada() {
        if (!acessa) {
            System.out.println("Lampada Desligada");
        }
    }
}
