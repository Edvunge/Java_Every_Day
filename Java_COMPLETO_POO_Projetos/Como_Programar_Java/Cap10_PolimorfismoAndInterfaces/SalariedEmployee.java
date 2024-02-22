package Java_COMPLETO_POO_Projetos.Como_Programar_Java.Cap10_PolimorfismoAndInterfaces;

public class SalariedEmployee extends Employee {
    private double weeklySalary;


    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0) throw new IllegalArgumentException("weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // configura o salario
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) throw new IllegalArgumentException("weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // retorna o salario
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // calcula os rendimentos; sobrecrescrever o metodo earnings em Employee
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%, .2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
