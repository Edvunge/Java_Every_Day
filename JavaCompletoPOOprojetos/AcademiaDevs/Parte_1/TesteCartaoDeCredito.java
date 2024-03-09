package JavaCompletoPOOprojetos.AcademiaDevs.Parte_1;

public class TesteCartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito cdc1 = new CartaoDeCredito(11122);

        cdc1.numero = 111111;
        cdc1.dataDeValidade = "01/01/2023";

        CartaoDeCredito cdc2 = new CartaoDeCredito(72111);
        cdc2.numero = 22222;
        cdc2.dataDeValidade = "01/01/2024";

        CartaoDeCredito cdc = new CartaoDeCredito(545);
        Cliente c = new Cliente();

        // ligando os objetos
        cdc.cliente.nome = "Rafael Cosentino";

        System.out.println("Dados do primeiro cartao");
        System.out.println("Numero: " + cdc1.numero);
        System.out.println("Data de validade: " + cdc1.dataDeValidade);

        System.out.println("------------------------------------------");

        System.out.println("Dados do segundo cartao");
        System.out.println("Dados do primeiro cartao");
        System.out.println("Numero: " + cdc2.numero);
        System.out.println("Data de validade: " + cdc2.dataDeValidade);

    }
}
