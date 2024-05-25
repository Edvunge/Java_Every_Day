package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section05_classesMetodos.classe;

public class DataTeste {
    public static void main(String[] args) {
        Data meuAniversario = new Data();
        meuAniversario.ano = 1995;
        meuAniversario.dia = 18;
        meuAniversario.mes = "Junho";

        Data aniversarioBaby = new Data();
        aniversarioBaby.ano = 2001;
        aniversarioBaby.dia = 30;
        aniversarioBaby.mes = "setembro";

        System.out.printf("\no seu aniversario eh: %d / %s / %d", meuAniversario.dia ,meuAniversario.mes ,meuAniversario.ano);
        System.out.printf("\no seu aniversario da baby: %d / %s / %d", aniversarioBaby.dia ,aniversarioBaby.mes ,aniversarioBaby.ano);
    }
}
