package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Edvaldo Vunge";
        nome.concat("DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder();
        StringBuilder bs = new StringBuilder("Edvaldo Vunge");
        System.out.println(bs.toString());

        System.out.println(nome.substring(0,3));
    }
}
