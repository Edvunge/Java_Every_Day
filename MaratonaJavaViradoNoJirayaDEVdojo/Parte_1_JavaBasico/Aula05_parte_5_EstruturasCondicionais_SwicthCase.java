package MaratonaJavaViradoNoJirayaDEVdojo.Parte_1_JavaBasico;

public class Aula05_parte_5_EstruturasCondicionais_SwicthCase {
    // Imprima o dia da semana, considerando 1 como domingo
    public static void main(String[] args) {
        int diaSemana = 2;

        switch (diaSemana) {
            case 1:
                System.out.println("O dia eh: Domingo");
                break;
            case 2:
                System.out.println("O dia eh: Segunda Feira");
                break;
            case 3:
                System.out.println("O dia eh: Terca Feira");
                break;
            case 4:
                System.out.println("O dia eh: Quarta Feira");
                break;
            case 5:
                System.out.println("O dia eh: Quinta Feira");
                break;
            case 6:
                System.out.println("O dia eh: Sexta Feira");
                break;
            case 7:
                System.out.println("O dia eh: Sabado");
                break;
            default:
                System.out.println("Dia Inexistente.");
        }
    }
}
