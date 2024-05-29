package w3schools.javaOOP.Construtors;

public class MainSecond {
    int x;

    public MainSecond(int y) {
        x = y;
    }

    public static void main(String[] args) {
        MainSecond mainSecond = new MainSecond(5);
        System.out.println(mainSecond.x);
    }
}
