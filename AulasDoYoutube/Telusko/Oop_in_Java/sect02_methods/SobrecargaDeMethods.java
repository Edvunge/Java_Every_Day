package AulasDoYoutube.Telusko.Oop_in_Java.sect02_methods;

class Calculator{
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class SobrecargaDeMethods {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add( 14, 15);
        System.out.println(r1);
    }
}
