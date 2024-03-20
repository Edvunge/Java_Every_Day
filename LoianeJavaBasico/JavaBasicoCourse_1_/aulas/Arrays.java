package LoianeJavaBasico.JavaBasicoCourse_1_.aulas;

public class Arrays {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32.3;
        temperaturas[2] = 30.33;
        temperaturas[3] = 13.9;
        temperaturas[4] = 38.9;

        System.out.println("O valor da tempratura do dia 3 eh: " + temperaturas[2]);
        System.out.println("o tamanho do array: " + temperaturas.length);
    }
}
