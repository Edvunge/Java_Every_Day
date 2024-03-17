package JavaCompletoPOOprojetos.AcademiaDevs.Parte_8_Polimorfismo.Parte_1_Polim;

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
