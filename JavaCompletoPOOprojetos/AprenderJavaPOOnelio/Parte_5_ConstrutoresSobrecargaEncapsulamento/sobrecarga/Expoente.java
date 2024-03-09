package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_5_ConstrutoresSobrecargaEncapsulamento.sobrecarga;

public class Expoente {
    // metodo que não calcula nada
    public static void elevar() {
        System.out.println("este metodo não calcula nada!");
    }

    // Metodo que calcula o quadrado de i
    public static double elevar(double i) {
        return i * i;
    }

    // Metodo que calcula i elevado a j
    public static double elevar(double i, double j) {
        return Math.pow(i, j);
    }
}
