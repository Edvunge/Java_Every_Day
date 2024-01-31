package Java_COMPLETO_POO_Projetos.AcademiaDevs;

public class PrincipalMonitor {
    public static void main(String[] args) {
        Monitor monitorX = new Monitor();
        monitorX.tamanhoTela = 24;
        monitorX.formato = "Quadricular";
        monitorX.largura = 7.4f;
        monitorX.marca = "HP";
        monitorX.modelo = "QuadCore";


        Monitor monitorY = new Monitor();
        monitorY.tamanhoTela = 55;
        monitorY.formato = "Quadricular CIRCULAR";
        monitorY.largura = 17.2f;
        monitorY.marca = "SAMSUNG";
        monitorY.modelo = "SYNC23";


        Monitor monitorZ = new Monitor();
        monitorZ.tamanhoTela = 32;
        monitorZ.formato = "Circular";
        monitorZ.largura = 6.4f;
        monitorZ.marca = "TOSHIBA";
        monitorZ.modelo = "OctaCore";

        System.out.format("O Monitor: %s de modelo: %s , com uma tela %d uma largura de %.1f com um formato: %s\n",monitorX.marca ,monitorX.modelo, monitorX.tamanhoTela ,monitorX.largura ,monitorX.formato);
        System.out.format("O Monitor: %s de modelo: %s , com uma tela %d uma largura de %.1f com um formato: %s\n",monitorZ.marca ,monitorZ.modelo, monitorZ.tamanhoTela ,monitorZ.largura ,monitorZ.formato);
        System.out.format("O Monitor: %s de modelo: %s , com uma tela %d uma largura de %.1f com um formato: %s\n",monitorY.marca ,monitorY.modelo, monitorY.tamanhoTela ,monitorY.largura ,monitorY.formato);
    }
}
