package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_11_Interface;

public class Quadrado  implements FiguraGeometrica {
    // Atributo
    private int lado;

    // Construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }

    // Metodo especifico
    /*public int gerarArea() {
        return lado * lado;
    }*/


    // Getters e Setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
