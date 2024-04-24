package AulasDoYoutube.CursoEmVideo.JavaOOP;

public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    public int  carga;
    public boolean tampada;


    void rabiscar(){
        if ( tampada == false) {
            System.out.println("erro");
        } else {
            System.out.println("pode rabiscar.");
        }
    }

    void escrever(){
    }

    void pintar(){}

    void tampar(){}
}
