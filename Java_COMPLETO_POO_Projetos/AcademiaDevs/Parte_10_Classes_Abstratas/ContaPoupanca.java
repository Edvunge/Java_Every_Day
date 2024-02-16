package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_10_Classes_Abstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
    private int diaDoAniversario;

    public void imprimeExtratoDetalhado() {
        System.out.println("EXTRATO DETALHADO DE CONTA POUPANCA");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
        Date agora = new Date();

        System.out.println("DATA: " + sdf.format(agora));
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("ANIVERSARIO: " + this.diaDoAniversario);
    }
}
