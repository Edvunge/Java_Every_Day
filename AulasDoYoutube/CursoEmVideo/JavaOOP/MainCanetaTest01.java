package AulasDoYoutube.CursoEmVideo.JavaOOP;

public class MainCanetaTest01 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "BIC CRISTAL";
        caneta.cor = "azul";
        caneta.ponta = 0.5;
        caneta.carga = 90;
        caneta.tampada = false;

        caneta.tampar();
        caneta.rabiscar();
        caneta.status();


        Caneta c2 = new Caneta();
        c2.modelo = "Hsotnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
