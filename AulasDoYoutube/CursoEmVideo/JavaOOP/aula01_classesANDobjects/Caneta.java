package AulasDoYoutube.CursoEmVideo.JavaOOP.aula01_classesANDobjects;

public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    public int  carga;
    public boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("modelo "+ this.modelo);
        System.out.println("carga: "+ this.carga);
        System.out.println("ponta: "+ this.ponta);
        System.out.println(" esta tampada. " + this.tampada);
    }

    void rabiscar(){
        if ( this.tampada == true) {
            System.out.println("erro! nao posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
