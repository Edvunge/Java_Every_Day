package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.nome = "Rafael Cosentino";
        c1.codigo = 1;

        Cliente c2 = new Cliente();
        c2.nome = "Jonas Hirata";
        c2.codigo = 2;

        System.out.println("Dados do Primeiro Cliente");
        System.out.println("Nome: " + c1.nome);
        System.out.println("Codigo: " + c1.codigo);

        System.out.println("--------------------------------------------------");

        System.out.println("Dados do Segundo Cliente");
        System.out.println("Nome: " + c2.nome);
        System.out.println("Codigo: " + c2.codigo);
    }
}
