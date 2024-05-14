package AulasDoYoutube.CursoEmVideo.JavaOOP.aula01_classesANDobjects;

public class MainCanecaTest01 {
    public static void main(String[] args) {
        Caneca caneca = new Caneca();
        caneca.cor = "branca com desenhos";
        caneca.formato = "circular";
        caneca.material = "plastico";
        caneca.pega = true;
        caneca.altura = 9.0;
        caneca.estadoVaziaOuCheia = true;

        System.out.println("cor = " + caneca.cor);
        System.out.println("formato = " + caneca.formato);
        System.out.println("material = " + caneca.material);
        System.out.println("pega = " + caneca.pega);
        System.out.println("altura = " + caneca.altura);
        System.out.println("estado vazio = " + caneca.estadoVaziaOuCheia);
        caneca.beber();
    }
}
