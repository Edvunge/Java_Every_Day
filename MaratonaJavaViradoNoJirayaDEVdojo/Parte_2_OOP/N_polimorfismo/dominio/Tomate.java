package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do TOMATE");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
