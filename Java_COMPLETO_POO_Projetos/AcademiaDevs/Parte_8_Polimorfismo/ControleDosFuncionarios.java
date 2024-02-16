package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_8_Polimorfismo;

public class ControleDosFuncionarios extends Funcionario {
    
    public void registrarEntrada(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void registrarSaida() {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

        System.out.format("nome: %s, idade: %d , sexo: %s",nome ,idade ,sexo);
    }
}
