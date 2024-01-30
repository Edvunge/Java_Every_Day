package Java_COMPLETO_POO_Projetos.Introd_POO_4.sobrecarga;

public class MetodosSobrecarregados {
    public static void main(String[] args) {
        double a = 4;
        double b = 5;

        System.out.printf("O quadrado de %.2f eh %.2f\n", a, Expoente.elevar(a));
        System.out.printf("%.2f elevado a %.2f eh %.2f\n", a, b, Expoente.elevar(a, b));
        Expoente.elevar();
    }
}
