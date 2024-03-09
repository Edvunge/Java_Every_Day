package JavaCompletoPOOprojetos.AcademiaDevs.Parte_16_Strings;

public class ClasseString {
    public static void main(String[] args) {
        /*
        length() -> o metodo length devolve a quantidade de caracteres de uma string
        */
        String nome = "K19 Treinamentos";

        System.out.println(nome.length());

        /*
        toUpperCase() -> este metodo e utilizado para obter uma copia de uma string com letras maiusculas.
        */
        String nome1 = "Rafael Cosentino";

        String nomeAleterado = nome1.toUpperCase();
        System.out.println(nomeAleterado);

        /*
        toLowerCase() -> este metodo e utilizado para obter uma copia de uma string com letras minusculas.
        */
        String nome2 = "Rafael Cosentino";

        String nome2Aleterado = nome1.toLowerCase();
        System.out.println(nome2Aleterado);


    }
}
