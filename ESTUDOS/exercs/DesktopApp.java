package ESTUDOS.exercs;

public class DesktopApp {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.monitor = true;
        desktop.formato = "Quadricular";
        desktop.marca = "samsung";
        desktop.modelo = "AXO01";

        desktop.ligar();
        System.out.println(" Monitor: " + desktop.monitor);
        System.out.println(" Formato: " + desktop.formato);
        System.out.println(" Marca: " + desktop.marca);
        System.out.println(" Modelo: " + desktop.modelo);
    }
}
