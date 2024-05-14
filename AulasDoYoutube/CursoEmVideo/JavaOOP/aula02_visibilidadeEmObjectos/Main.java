package AulasDoYoutube.CursoEmVideo.JavaOOP.aula02_visibilidadeEmObjectos;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic cristal";
        c1.carga = 90;
        c1.tampada = false;
        c1.status();

    }
}
