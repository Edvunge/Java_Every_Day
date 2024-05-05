package geeksForGeeks.JavaCourse.Parte_6_Array.GEneralGastos;

import java.util.Scanner;

public class FontesDeRendas {
    public double salaryE;
    public double salaryJ;
    public double aulasProg;

    public void totalGanhos(){
        double totalG = this.salaryJ + this.salaryE + this.aulasProg;

        System.out.printf("\nO Total de Ganhos neste Mes foi de: %.2f", totalG);
    }
}
