package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.Q_string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "0123456";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "L"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
    }
}
