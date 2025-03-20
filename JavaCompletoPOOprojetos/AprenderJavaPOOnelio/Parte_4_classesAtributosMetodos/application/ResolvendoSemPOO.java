package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_4_classesAtributosMetodos.application;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_4_classesAtributosMetodos.enteties.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class ResolvendoSemPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangule x, y;
        x = new Triangule();
        y = new Triangule();

        System.out.println("Enter the measures of triangule X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.c) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangule X area: %.4f%n", areaX);
        System.out.printf("Triangule Y area: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("larger area: " + areaX);
        } else {
            System.out.println("larger area: " + areaY);
        }
        sc.close();
    }
}
