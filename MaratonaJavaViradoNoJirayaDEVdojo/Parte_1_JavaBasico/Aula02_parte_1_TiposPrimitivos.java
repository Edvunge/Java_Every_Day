package MaratonaJavaViradoNoJirayaDEVdojo.Parte_1_JavaBasico;

public class Aula02_parte_1_TiposPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos
        // existem 8 tipos primitivos: int, double, float, char, byte, short, long, boolean

        // sintaxe do java
        // <tipoDeVariavel> <nomeDaVariavel> = <valorInicializado>
        int age = 28;
        double height = 1.90;
        float weight = 100f;
        char firstLatterOfMyName = 'E';
        byte numberRandom = 127;
        short number = 2;
        long numberOfMyCellphone = 999222993;
        boolean sex = true;

        System.out.println("your age is: " + age);
        System.out.println("your height is: " + height);
        System.out.println("your weight is: " + weight);
        System.out.println("first latter of my name is: " + firstLatterOfMyName);
        System.out.println("your random number is: " + numberRandom);
        System.out.println("your number is: " + number);
        System.out.println("your cellphone number is: " + numberOfMyCellphone);
        System.out.println("are you male: say true or female: say false " + sex);
    }
}
