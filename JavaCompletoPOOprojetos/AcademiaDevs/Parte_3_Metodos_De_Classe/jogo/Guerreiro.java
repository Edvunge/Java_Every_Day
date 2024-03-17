package JavaCompletoPOOprojetos.AcademiaDevs.Parte_3_Metodos_De_Classe.jogo;

public class Guerreiro extends Personagem {

    @Override
    public void atacar() {
        int valorDado6Faces = this.rolarDado();
        if (valorDado6Faces < 3) {
            System.out.println("O guerreiro errou o ataque!!");
        } else {
            System.out.println("O guerriro acertou o inimigo!!!");
        }
    }
}
