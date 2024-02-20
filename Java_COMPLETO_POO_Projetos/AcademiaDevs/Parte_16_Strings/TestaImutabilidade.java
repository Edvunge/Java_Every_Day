package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_16_Strings;

public class TestaImutabilidade {
    public static void main(String[] args) {
        String nome = "Rafael Cosentino";

        String nomeAlterado = nome.toUpperCase();

        // imprime Rafael Cosentino
        System.out.println(nome);

        System.out.println(nomeAlterado);
    }
}
