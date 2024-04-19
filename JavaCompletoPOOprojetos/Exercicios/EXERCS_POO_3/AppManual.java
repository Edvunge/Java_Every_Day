package JavaCompletoPOOprojetos.Exercicios.EXERCS_POO_3;

public class AppManual {
    public static void main(String[] args) {
        Manual manualEducativo = new Manual();
        manualEducativo.autor = "ed";
        manualEducativo.cor = "verde claro";
        manualEducativo.curvaturaDaCapa = 1.23;

        System.out.println(manualEducativo.autor);
        System.out.println(manualEducativo.curvaturaDaCapa);
        System.out.println(manualEducativo.cor);
    }
}
