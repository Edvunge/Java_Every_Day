package JavaComplT_Profissional_leonardoLeitao.section07_orientacaoObjetos.heranca;

public class Jogador {
    int x;
    int y;
    int vida = 100;

    Jogador() {
        this(0, 0);
    }

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

    boolean andar(Direccao direccao) {
        switch (direccao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }

        return true;
    }
}
