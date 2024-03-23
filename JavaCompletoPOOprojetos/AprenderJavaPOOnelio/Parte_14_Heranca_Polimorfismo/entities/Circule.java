package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_Heranca_Polimorfismo.entities;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_Heranca_Polimorfismo.entitiess.enums.Color;

public class Circule extends Shape {

    private Double radius;

    public Circule() {
        super();
    }

    public Circule(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
