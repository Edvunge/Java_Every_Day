package AlgaworksBlack.logicaProgramacaoComJava.poo.exercicio03;

public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setCodigo(2.12);
        pedido.setDesconto(1.0);
        pedido.setSubtotal(1.0 + 2.12);
       // pedido.setTotal(1.3 + 6.63 + 2.3);

        System.out.println("Codigo: " + pedido.getCodigo() + "Desconto: " + pedido.getDesconto() +  "Subtotal: " + pedido.getSubtotal() /*+ "Total: " + pedido.getTotal()*/);
    }
}
