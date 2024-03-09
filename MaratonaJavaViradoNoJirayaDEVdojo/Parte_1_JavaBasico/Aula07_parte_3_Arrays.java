package MaratonaJavaViradoNoJirayaDEVdojo.Parte_1_JavaBasico;

public class Aula07_parte_3_Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
