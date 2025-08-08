package AulasDoYoutube.Telusko.Oop_in_Java.sect02_methods;

class Calculadora {
    int a;

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class Methods {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculadora calc = new Calculadora();

        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}
