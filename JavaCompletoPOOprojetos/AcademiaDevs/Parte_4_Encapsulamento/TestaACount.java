package JavaCompletoPOOprojetos.AcademiaDevs.Parte_4_Encapsulamento;

public class TestaACount {
    public static void main(String[] args) {
        /*
          Funcionario f = new Funcionario();

        f.setNome("Rafael Cosentino");
        f.setSalario(2000);

        System.out.println("Nome: " + f.getNome());
        System.out.println("Salario: " + f.getSalario());
         */
        Count count = new Count();

        count.setNumero(12334);
        count.setSaldo(234.5);
        count.setLimite("05/fev/2024");

        System.out.println("numero: " + count.getNumero());
        System.out.println("Saldo: " + count.getSaldo());
        System.out.println("Limite: " + count.getLimite());
    }
}