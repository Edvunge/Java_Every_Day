package JavaCompletoPOOprojetos.AcademiaDevs.Parte_5_Heranca.OldClasses;

public class Emprestimo extends Servico_cls {
    private double valor;
    private double taxa;

    public double calculaTaxaDeEmprestimo() {
        return this.valor * 0.1;
    }

    public static void main(String[] args) {
        Emprestimo e = new Emprestimo();

        SeguroDeVeiculo sdv = new SeguroDeVeiculo();

        System.out.println("Emprestimo: " + e.calculaTaxa());

        System.out.println("SeguroDeVeiculo: " + sdv.calculaTaxa());
    }
}
