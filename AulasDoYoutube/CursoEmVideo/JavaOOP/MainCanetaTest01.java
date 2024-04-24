package AulasDoYoutube.CursoEmVideo.JavaOOP;

public class MainCanetaTest01 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.modelo = "BIC CRISTAL";
        caneta.cor = "azul";
        caneta.ponta = 0.5;
        caneta.carga = 90;
        caneta.tampada = false;
        caneta.rabiscar();
    //Bic cristal, azul, 0.5, 90, falso
    }
}
