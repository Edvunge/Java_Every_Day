package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.test;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.dominio.Computador;
import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.dominio.Tomate;
import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 10100);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalcularImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------------------------------");
        CalcularImposto.calcularImpostoTomate(tomate);
    }
}
