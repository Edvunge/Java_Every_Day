package JavaCompletoPOOprojetos.AcademiaDevs.Parte_3_Metodos_De_Classe.jogo;

import java.util.Random;

public abstract class Personagem {
    public abstract void atacar();

    protected int rolarDado() {
        Random gerador = new Random();
        int numero = 1 + gerador.nextInt(6);
        return numero;
    }
}
