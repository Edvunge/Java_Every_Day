package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_11_Interface;

public class Circulo implements FiguraGeometrica {
    //Atributos
    private int raio;

    // Construtores
    public Circulo(int raio) {
       this.raio = raio;
    }

    // Metodos especificos da classe
    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    // Metodos getters e setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
