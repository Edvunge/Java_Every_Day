package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_Heranca_Polimorfismo.entities;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_Heranca_Polimorfismo.entitiess.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(){}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}