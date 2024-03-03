package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_5_Heranca.Animais;

public class Cachorro extends Animal {

    public void latir() {
        System.out.printf("%s latiu", getNome());
    }

    public void lamber() {
        System.out.printf("%s lambeu", getNome());
    }
}
