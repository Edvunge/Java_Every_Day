package Java_COMPLETO_POO_Projetos.AcademiaDevs;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa pessoaX = new Pessoa();
        pessoaX.nome = "edvaldo";
        pessoaX.altura = 1.90;
        pessoaX.idade = 28;
        pessoaX.peso = 100.8;
        pessoaX.profissao = "Programador";
        pessoaX.raca = "negra";


        Pessoa pessoaZ = new Pessoa();
        pessoaZ.nome = "Juelcia";
        pessoaZ.altura = 1.67;
        pessoaZ.idade = 24;
        pessoaZ.peso = 56.4;
        pessoaZ.profissao = "Funcionaria";
        pessoaZ.raca = "negra";

        System.out.format("O seu nome: %s , a sua altura: %.1f , idade: %d com o peso: %.1f sua profissao: %s a minha raca: %s\n",pessoaX.nome ,pessoaX.altura ,pessoaX.idade ,pessoaX.peso ,pessoaX.profissao , pessoaX.raca);
        System.out.format("O seu nome: %s , a sua altura: %.1f , idade: %d com o peso: %.1f sua profissao: %s a minha raca: %s\n",pessoaZ.nome ,pessoaZ.altura ,pessoaZ.idade ,pessoaZ.peso ,pessoaZ.profissao , pessoaZ.raca);
    }
}
