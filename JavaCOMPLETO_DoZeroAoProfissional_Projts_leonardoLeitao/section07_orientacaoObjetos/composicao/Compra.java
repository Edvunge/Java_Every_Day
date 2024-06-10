package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section07_orientacaoObjetos.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
