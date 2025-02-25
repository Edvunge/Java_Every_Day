package JavaComplT_Profissional_leonardoLeitao.section05_classesMetodos.classe;

public class DataTeste {
    public static void main(String[] args) {
        Data meuAniversario = new Data();
        meuAniversario.ano = 1995;
        meuAniversario.dia = 18;
        meuAniversario.mes = 6;

        Data aniversarioBaby = new Data(31, 12, 2020);


        System.out.println("Edvaldo birthday " + meuAniversario.obterDataFormatada());
        System.out.println("Juelcia birthday " + aniversarioBaby.obterDataFormatada());
    }
}
