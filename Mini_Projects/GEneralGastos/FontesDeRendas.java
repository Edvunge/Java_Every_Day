package Mini_Projects.GEneralGastos;

public class FontesDeRendas {
    public double salaryE;
    public double salaryJ;
    public double aulasProg;

    public double totalGanhos(){
        double totalG = this.salaryJ + this.salaryE + this.aulasProg;

        //System.out.printf("\nO Total de Ganhos neste Mes foi de: %.2f", totalG);
        return totalG;
    }
}
