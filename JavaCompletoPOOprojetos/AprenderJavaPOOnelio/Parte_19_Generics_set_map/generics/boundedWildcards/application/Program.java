package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_19_Generics_set_map.generics.boundedWildcards.application;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_19_Generics_set_map.generics.boundedWildcards.entities.Circle;
import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_19_Generics_set_map.generics.boundedWildcards.entities.Rectangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            //sum += s.area();
        }
        return sum;
    }
}
