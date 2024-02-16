package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_9_Object;

public class Conta {
    private int numero;
    private double saldo;

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) obj;
        if (numero != other.numero) {
            return false;
        }
        return true;
    }
}
