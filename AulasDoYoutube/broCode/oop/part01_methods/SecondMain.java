package AulasDoYoutube.broCode.oop.part01_methods;

public class SecondMain {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        // add(x, y);
        System.out.println(add(x, y));
    }

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }
}
