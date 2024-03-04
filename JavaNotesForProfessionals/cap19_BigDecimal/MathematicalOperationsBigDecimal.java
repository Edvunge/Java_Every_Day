package JavaNotesForProfessionals.cap19_BigDecimal;

import java.math.BigDecimal;

public class MathematicalOperationsBigDecimal {
    public static void main(String[] args) {
        // 1.Addition
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("7");

        // equilante to result = a + b
        BigDecimal result = a.add(b);
        System.out.println("add: " + result);

        // 2.Subtraction
        BigDecimal a1 = new BigDecimal("5");
        BigDecimal b1 = new BigDecimal("7");

        BigDecimal result1 = a1.subtract(b1);
        System.out.println("subtract: " + result1);


        // 3.multiplication
        BigDecimal a2 = new BigDecimal("5");
        BigDecimal b2 = new BigDecimal("7");

        BigDecimal result2 = a2.multiply(b2);
        System.out.println("multiply: " + result2);

        // 4.Division
        BigDecimal a3 = new BigDecimal("5");
        BigDecimal b3 = new BigDecimal("7");

        BigDecimal result3 = a3.divide(b3);
        System.out.println("divide: " + result3);


        // 5.Remainder or Modulus
        BigDecimal a4 = new BigDecimal("5");
        BigDecimal b4 = new BigDecimal("7");

        BigDecimal result4 = a4.remainder(b4);
        System.out.println("remainder: " + result4);


        // 6.Power
        BigDecimal a5 = new BigDecimal("5");
        BigDecimal b5 = new BigDecimal("7");

        BigDecimal result5 = a5.pow(10);
        System.out.println("Pow: " + result5);

        // 7. Max
        BigDecimal a6 = new BigDecimal("5");
        BigDecimal b6 = new BigDecimal("7");

        BigDecimal result6 = a6.max(b6);
        System.out.println("max: " + result6);

        // 8.Min
        BigDecimal a7 = new BigDecimal("5");
        BigDecimal b7 = new BigDecimal("7");

        BigDecimal result7 = a7.min(b7);
        System.out.println("min: " + result7);

        // 9. Move Point To Left
        BigDecimal a8 = new BigDecimal(5234.49843776);

        BigDecimal result8 = a8.movePointLeft(2);
        System.out.println("movePointLeft: " + result8);

        // 9. Move Point To Right
        BigDecimal a9 = new BigDecimal(5234.49843776);

        BigDecimal result9 = a9.movePointRight(2);
        System.out.println("movePointRight: " + result9);
    }
}
