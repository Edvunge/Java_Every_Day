package JavaCompletoPOOprojetos.AcademiaDevs.Parte_3_Metodos_De_Classe;

public class TestaContador {
    public static void main(String[] args) {

        System.out.println("Contador: " + Conta.contador);

        Conta c1 = new Conta();

        System.out.println("Contador: " + Conta.contador);

        Conta c2 = new Conta();

        System.out.println("Contador: " + Conta.contador);
    }
}
