package AulasDoYoutube.eXcript.javaOOP;

public class MainSobrecarga {
    public static void main(String[] args) {
        new Sobrecarga().imprime("um parametro do tipo string");
        new Sobrecarga().imprime("um primeiro parametro do tipo string", "segundo");
        new Sobrecarga().imprime("a idade eh: " , 35);
    }
}
