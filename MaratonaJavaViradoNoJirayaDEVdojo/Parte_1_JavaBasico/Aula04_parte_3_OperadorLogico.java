package MaratonaJavaViradoNoJirayaDEVdojo.Parte_1_JavaBasico;

public class Aula04_parte_3_OperadorLogico {
    public static void main(String[] args) {
        // op logico: e && (and) ,   || (or) ou
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade > 30 && salario >= 3312;

        System.out.println("isDentroDaLei: " + isDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);
    }
}
