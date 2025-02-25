package JavaComplT_Profissional_leonardoLeitao.section07_orientacaoObjetos.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.itens.add(new Item("Caneta", 20, 7.45));
        compra1.itens.add(new Item("Borracha", 12, 3.90));
        compra1.itens.add(new Item("Caderno", 21, 2.53));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
