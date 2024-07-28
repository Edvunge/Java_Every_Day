package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula33_overloading.exercs;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada q23ed = new Lampada();
        q23ed.setAcessa(true);
        q23ed.setModelo("INESC");
        q23ed.setValor(54);
        q23ed.setMarca("novo");
        q23ed.setLargura(8.2);
        q23ed.setCentimetrosCM(8990);
        q23ed.setTamanho(9.0);
        q23ed.setVoltagem(77.9);

        q23ed.ligarLampada();
        System.out.println();
        q23ed.desligarLampada();
    }
}
