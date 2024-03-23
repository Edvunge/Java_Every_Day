package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.servico;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.dominio.Computador;
import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.dominio.Tomate;

public class CalcularImposto {
    public static void calcularImpostoComputador(Computador computador){

        System.out.println("Relatorio de imposto do compuador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){

        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
}
