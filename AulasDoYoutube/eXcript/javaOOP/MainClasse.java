package AulasDoYoutube.eXcript.javaOOP;

class calculo{
    void soma(int num1, int num2) {
        System.out.println(num1+num2);
    }
}

public class MainClasse {

    public static void main(String[] args) {
        calculo cal = new calculo();
        cal.soma(7, 8);
    }
}
