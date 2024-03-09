package JavaCompletoPOOprojetos.AcademiaDevs.Parte_9_Object;

public class MetodoEquals {
    private int numero;
    private double saldo;

    public boolean compara(MetodoEquals outra) {
        return this.numero == outra.numero;
    }

    public boolean equals(Object obj) {
        MetodoEquals outra = (MetodoEquals)obj;
        return this.numero == outra.numero;
    }

}
