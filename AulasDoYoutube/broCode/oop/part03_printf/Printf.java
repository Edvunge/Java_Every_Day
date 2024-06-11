package AulasDoYoutube.broCode.oop.part03_printf;

public class Printf {
    public static void main(String[] args) {
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("\n%b", myBoolean);
        System.out.printf("\n%c", myChar);
        System.out.printf("\n%s", myString);
        System.out.printf("\n%d", myInt);
        System.out.printf("\n%f", myDouble);

        // [width]
        System.out.printf("\nhello %10s", myString);

        // [precision]
        System.out.printf("You have this much money %.1f", myDouble);
    }
}
