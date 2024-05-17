package AulasDoYoutube.eXcript.javaOOP;

public class Sobrecarga {
    void imprime(String s) {
        System.out.println(s);
    }

    void imprime(String s1, String s2) {
        System.out.println(s1+" - "+s2);
    }

    void imprime(String s1, int i1) {
        System.out.println(s1+" - "+i1);
    }
}
