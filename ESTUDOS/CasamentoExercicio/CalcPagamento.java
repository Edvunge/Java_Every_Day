package ESTUDOS.CasamentoExercicio;

public class CalcPagamento {
    public static void main(String[] args) {
        // pagamentos por prestacao
        // 1. prestacao: 50%
        // 2. prestacao: 30%
        // 3. prestacao: 20%
        double valorTotal = 1800000;
        double prest1_50, prest2_30, prest3_20;

        prest1_50 = valorTotal * 50 / 100;
        prest1_50 = valorTotal - prest1_50;
        System.out.println("1 prestacao(50%) sera de: " + prest1_50);

        prest2_30 = valorTotal * 30 / 100;
        prest2_30 = valorTotal - prest2_30;
        System.out.println("2 prestacao(30%) sera de: " + prest2_30);

        prest3_20 = valorTotal * 20 / 100;
        prest3_20 = valorTotal - prest3_20;
        System.out.println("3 prestacao(20%) sera de: " + prest3_20);
        
    }
}
