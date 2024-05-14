package AulasDoYoutube.CursoEmVideo.JavaOOP.aula01_classesANDobjects;

public class Caneca {
    // cor(string), formato(string), pega(bool)
    // altura(float),
    public String cor;
    public String formato;
    public String material;
    public boolean pega;
    public double altura;
    public boolean estadoVaziaOuCheia;

    void beber(){
        if (this.estadoVaziaOuCheia == true) {
            System.out.println("pode beber.");
        } else {
            System.out.println("nao pode beber.");
        }
    }
}
