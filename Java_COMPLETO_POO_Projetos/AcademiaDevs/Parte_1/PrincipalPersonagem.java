package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1;

public class PrincipalPersonagem {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostraStatus();
        heroi.atacar("Hydra", "");
    }
}
