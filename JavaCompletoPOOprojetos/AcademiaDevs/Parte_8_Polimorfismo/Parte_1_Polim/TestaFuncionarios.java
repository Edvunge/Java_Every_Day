package JavaCompletoPOOprojetos.AcademiaDevs.Parte_8_Polimorfismo.Parte_1_Polim;

public class TestaFuncionarios {
    public static void main(String[] args) {
        ControleDosFuncionarios controleDosFuncionarios = new ControleDosFuncionarios();


        Telefonistas telefonista = new Telefonistas();
        telefonista.telQuest = true;

        controleDosFuncionarios.registrarEntrada("edvaldo", 28, "masculino");
        controleDosFuncionarios.registrarSaida();
        System.out.println("\nEh telefonista: " + telefonista.telQuest);
    }
}
