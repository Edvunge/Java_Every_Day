package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_10_Classes_Abstratas;

public class TestaConta {
    public static void main(String[] args) {
        Conta c = new ContaPoupanca();
        c.setSaldo(1000);

        c.imprimeExtratoDetalhado();
    }
}
