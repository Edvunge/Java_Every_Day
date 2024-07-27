package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.exercs.dominio;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada q23ed = new Lampada();
        q23ed.acessa = false;
        q23ed.modelo = "INESC";
        q23ed.valor = 54;
        q23ed.marca = "novo";
        q23ed.largura = 8.2;
        q23ed.centimetrosCM = 8990;
        q23ed.tamanho = 9.0;
        q23ed.voltagem = 77.9;

        q23ed.ligarLampada();
        System.out.println();
        q23ed.desligarLampada();
    }
}
