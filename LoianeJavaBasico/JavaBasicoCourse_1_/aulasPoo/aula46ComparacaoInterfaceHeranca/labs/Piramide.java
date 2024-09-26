package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula46ComparacaoInterfaceHeranca.labs;

public class Piramide extends Figura3D {
    private double altura;
    private double apotema;
    private double arrestaBase;

    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getArrestaBase() {
        return arrestaBase;
    }

    public void setArrestaBase(double arrestaBase) {
        this.arrestaBase = arrestaBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }
}
