package ESTUDOS.exercs;

public class Desktop {
    public String modelo;
    public boolean monitor;
    public String marca;
    public String formato;
    public int numero;

    void ligar() {
        if (monitor == true) {
            System.out.println("Pc Ligado!");
        } else {
            System.out.println("Pc Desligado!");
        }
    }
}
