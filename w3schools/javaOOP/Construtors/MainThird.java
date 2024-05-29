package w3schools.javaOOP.Construtors;

public class MainThird {
    int modelYear;
    String modelName;

    public MainThird(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        MainThird myCar = new MainThird(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
