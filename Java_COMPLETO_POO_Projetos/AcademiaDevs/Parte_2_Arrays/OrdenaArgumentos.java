package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_2_Arrays;

public class OrdenaArgumentos {
    public static void main(String[] args) {
        java.util.Arrays.sort(args);

        for(String arg : args) {
            System.out.println(arg);
        }
    }
}
