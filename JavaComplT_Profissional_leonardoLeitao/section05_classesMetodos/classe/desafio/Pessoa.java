package JavaComplT_Profissional_leonardoLeitao.section05_classesMetodos.classe.desafio;

public class Pessoa {

// pessoa, (nome, peso, comer() , )

    public String nome;
    public double peso;

    Pessoa (String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }
}
