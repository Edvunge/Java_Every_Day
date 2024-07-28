package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula33_overloading.exercs;

public class Lampada {

    // = = = = = = =  atributos = = = = = = =
    private boolean acessa;
    private double tamanho;
    private double voltagem;
    private double largura;
    private int centimetrosCM;
    private String marca;
    private String modelo;
    private int valor;

    public boolean isAcessa() {
        return acessa;
    }

    public void setAcessa(boolean acessa) {
        this.acessa = acessa;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public int getCentimetrosCM() {
        return centimetrosCM;
    }

    public void setCentimetrosCM(int centimetrosCM) {
        this.centimetrosCM = centimetrosCM;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

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
