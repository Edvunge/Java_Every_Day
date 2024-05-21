package UdemyCourses.CursoDeJavaOOPwithHelderAragao;

public class ClienteApp {
    public static void main(String[] args) {
        ClientePF clientePF1 = new ClientePF("xyz", "bairro tal", "1221323");
        ClientePJ clientePJ1 = new ClientePJ("ZXY", "bairro talQUALQ", "98989");

        System.out.println("cliente pf dados" + " cpf: " + clientePF1.getCpf() + " nome: " + clientePF1.getNome());

        System.out.println(clientePF1.toString());
        System.out.println(clientePJ1.toString());
    }
}
