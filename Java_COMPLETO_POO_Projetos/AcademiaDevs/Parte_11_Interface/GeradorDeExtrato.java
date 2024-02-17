package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_11_Interface;

public class GeradorDeExtrato {
    public void geraExtrato(Conta c) {
        System.out.println("EXTRATO");
        System.out.println("SALDO: " + c.getSaldo());
    }
}
