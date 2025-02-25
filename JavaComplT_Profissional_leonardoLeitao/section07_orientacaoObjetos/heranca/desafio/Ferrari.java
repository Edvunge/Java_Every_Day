package JavaComplT_Profissional_leonardoLeitao.section07_orientacaoObjetos.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari() {
        super(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }
}
