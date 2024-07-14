package AlgaworksBlack.logicaProgramacaoComJava.poo.classeInstancia;

public class ClasseInstancia {
    public static void main(String[] args) {

        System.out.println("Quantidade Minima Estoque: " + Produto.QUANTIIDADE_MINIMA_ESTOQUE);

        Produto produto00 = new Produto();
        produto00.nome = "caneca";

        Produto.QUANTIIDADE_MINIMA_ESTOQUE = 11;
        System.out.println("Quantidade Minima Estoque: " + Produto.QUANTIIDADE_MINIMA_ESTOQUE);

        System.out.println("Produto 0: " + produto00.nome);
    }
}
