package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.Q_string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William";// String constant pool
        String nome2 = "William";

        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
    }
}
