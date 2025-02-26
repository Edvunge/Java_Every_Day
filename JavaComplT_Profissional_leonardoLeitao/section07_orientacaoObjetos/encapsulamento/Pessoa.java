package JavaComplT_Profissional_leonardoLeitao.section07_orientacaoObjetos.encapsulamento;

public class Pessoa {

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }
}
