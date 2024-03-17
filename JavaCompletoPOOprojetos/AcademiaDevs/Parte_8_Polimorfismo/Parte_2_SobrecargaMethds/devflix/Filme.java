package JavaCompletoPOOprojetos.AcademiaDevs.Parte_8_Polimorfismo.Parte_2_SobrecargaMethds.devflix;

public class Filme extends Video{
    public Filme(String nome) {
        super(nome);
    }

    @Override
    public void play() {
        super.play();
    }
}
