package Projects.fase_2.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua das Flores, 123");

        System.out.println("Sistema de Biblioteca Iniciado!");
        System.out.println("====================================\n");

        Funcionario funcionario = new Funcionario(
                "Ana Silva", "12345678901", "ana@biblioteca.com",
                "Bibliotecario", "Atendimento"
        );
        biblioteca.cadastrarFuncionario(funcionario);

        Usuario usuario1 = new Usuario("João Santos", "98765432100", "joao@email.com", "USR001");
        Usuario usuario2 = new Usuario("Maria Costa", "11122233344", "maria@email.com", "USR002");

        biblioteca.cadastrarUsuario(usuario1);
        biblioteca.cadastrarUsuario(usuario2);

        Livro livro1 = new Livro("978-0134685991", "Effective Java", "Joshua Bloch", "Addison-Wesley", 2017, "Programação", 3);
        Livro livro2 = new Livro("978-5554685991", "Effective C++", "Scott Meyers", "Addison-Wesley", 2005, "Programação", 2);
        Livro livro3 = new Livro("978-2224685991", "Javascript: The Good Parts", "Douglas Crockford", "O'Reilly", 2008, "Programação", 1);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("TESTANDO FUNCIONALIDADES");
        System.out.println("=".repeat(50));

        System.out.println("\n Realizando Emprestimos...");
        biblioteca.realizarEmprestimo("98765432100", "978-0134685991", "12345678901");
        biblioteca.realizarEmprestimo("11112223334", "978-0321356680", "12345678901");
        biblioteca.realizarEmprestimo("98765432100", "978-0596517748", "12345678901");

        System.out.println("\n Tentando emprestar livro já emprestado ...");
        biblioteca.realizarEmprestimo("111222333444", "978-0596517748", "12345678901");

        biblioteca.gerarRelatorioLivros();
        biblioteca.gerarRelatorioEmprestimos();
        biblioteca.listarUsuarios();

        System.out.println("\n Devolvendo Livro...");
        biblioteca.devolverLivro(1);

        System.out.println("\n Buscando livros por autor 'joshua' ...");
        biblioteca.buscarLivrosPorAutor("Joshua").forEach(System.out::println);

        System.out.println("\n Livros disponiveis apos devolução:");
        biblioteca.listarLivrosDisponiveis().forEach(System.out::println);

        System.out.println("\n Sistema Finalizado com Sucesso!");
    }
}
