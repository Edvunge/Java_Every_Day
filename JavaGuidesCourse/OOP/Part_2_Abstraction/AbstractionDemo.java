package JavaGuidesCourse.OOP.Part_2_Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        Employee contractor = new Contractor("contractor", 10, 10);
        Employee fulltimeEmployee = new FullTimeEmployee("full time employee", 8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fulltimeEmployee.calculateSalary());
    }
}
