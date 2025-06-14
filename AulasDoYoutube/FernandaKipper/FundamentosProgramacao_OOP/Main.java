package AulasDoYoutube.FernandaKipper.FundamentosProgramacao_OOP;

public class Main {
    public static void main(String[] args) {
        int minhaIdade = 29;
        String meuNome = "Rman Pollinks";

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000000l;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Edvaldo";
        boolean bool = false;


        if(str.isBlank()) {
            System.out.println("Verdadeiro");
        } else if(str == "Edvaldo"){
            System.out.println("Edvaldo");
        } else {
            System.out.println("Falso");
        }
    }
}
