package Projects.fase_2.Biblioteca;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Usuario> usuarios;
    private List<Funcionario> funcionarios;
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.usuarios = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    // ===== GESTÃO DE USUARIOS ====
    public void cadastrarUsuario(Usuario usuario) {
        if (buscarUsuarioPorCpf(usuario.getCpf()) == null) {
            usuarios.add(usuario);
            System.out.println("Usuário cadastrado: " + usuario.getNome());
        } else {
            System.out.println("Usuário já existe com este CPF!");
        }
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        if (buscarFuncionarioPorCpf(funcionario.getCpf()) == null) {
            funcionarios.add(funcionario);
            System.out.println("Funcionario cadastrado: " + funcionario.getNome());
        } else {
            System.out.println("Funcionario já existe com este CPF!");
        }
    }

    public Usuario buscarUsuarioPorCpf(String cpf) {
        return usuarios.stream()
                .filter(u -> u.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public Funcionario buscarFuncionarioPorCpf(String cpf) {
        return funcionarios.stream()
                .filter(f -> f.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    // ====== GESTÃO DE LIVROS ======
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public List<Livro> buscarLivrosPorTitulo(String titulo) {
        return livros.stream()
                .filter(l -> l.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Livro> buscarLivrosPorAutor(String autor) {
        return livros.stream().filter(l -> l.getAutor().toLowerCase().contains(autor.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Livro> listarLivrosDisponiveis() {
        return livros.stream()
                .filter(Livro::isDisponivel)
                .collect(Collectors.toList());
    }

    // ===== SISTEMA DE EMPRESTIMOS ======
    public boolean realizarEmprestimo(String cpfUsuario, String isbnLivro, String cpfFuncionario) {
        Usuario usuario = buscarUsuarioPorCpf(cpfUsuario);
        Funcionario funcionario = buscarFuncionarioPorCpf(cpfFuncionario);
        Livro livro = buscarLivroPorIsbn(isbnLivro);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return false;
        }

        if (funcionario == null) {
            System.out.println("Funcionário não encontrado!");
            return false;
        }

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return false;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Usuário não pode emprestar (inativo ou muitos empréstimos)!");
            return false;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro não disponivel!");
            return false;
        }

        if (livro.emprestar()) {
            Emprestimo emprestimo = new Emprestimo(usuario, livro, funcionario);
            emprestimos.add(emprestimo);
            usuario.adicionarEmprestimo(emprestimo);
            funcionario.processarEmprestimo(emprestimo);

            System.out.println("Emprestimo realizado com sucesso!");
            System.out.println("\uD83D\uDCCB " + emprestimo);
            return true;
        }
        return false;
    }

    public boolean devolverLivro(int idEmprestimo) {
        Emprestimo emprestimo = emprestimos.stream()
                .filter(e -> e.getId() == idEmprestimo && !e.isDevolvido())
                .findFirst().orElse(null);

        if (emprestimo == null) {
            System.out.println("Empréstimo não encontrado ou já devolvido!");
            return false;
        }

        emprestimo.devolver();

        if (emprestimo.isAtrasado()) {
            System.out.println("Devolução com atraso de " + emprestimo.getDiasAtraso() + " dias!");
        }

        System.out.println("Livro devolvido com sucesso!");
        return true;
    }

    private Livro buscarLivroPorIsbn(String isbn) {
        return livros.stream()
                .filter(l -> l.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    // ===== RELATORIOS ==========
    public void gerarRelatorioEmprestimos() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RELATORIO DE EMPRESTIMOS - " + nome);
        System.out.println("=".repeat(50));

        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum emprestimo registrado.");
            return;
        }

        long emprestimosAtivos = emprestimos.stream().filter(e -> !e.isDevolvido()).count();
        long emprestimosAtrasados = emprestimos.stream().filter(Emprestimo::isAtrasado).count();

        System.out.println("Total de emprestimos: " + emprestimos.size());
        System.out.println("Emprestimos ativos: " + emprestimosAtivos);
        System.out.println("Emprestimos Atrasados: " + emprestimosAtrasados);
        System.out.println("\n Lista de emprestimos:");

        emprestimos.forEach(System.out::println);
    }

    public void gerarRelatorioLivros() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RELATORIO DE LIVROS - " + nome);
        System.out.println("=".repeat(50));

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        long livrosDisponiveis = livros.stream().filter(Livro::isDisponivel).count();

        System.out.println("Total de livros: " + livros.size());
        System.out.println("Livros disponiveis: " + livrosDisponiveis);
        System.out.println("\n Catalogo:");

        livros.forEach(System.out::println);
    }

    public void listarUsuarios() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("USUARIOS CADASTRADOS - " + nome);
        System.out.println("=".repeat(50));

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario cadastrado.");
            return;
        }

        usuarios.forEach(System.out::println);
    }
}
