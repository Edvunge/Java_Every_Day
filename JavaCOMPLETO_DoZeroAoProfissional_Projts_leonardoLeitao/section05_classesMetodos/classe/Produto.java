package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section05_classesMetodos.classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
