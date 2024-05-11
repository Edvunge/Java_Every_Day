package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

public class Exerc14 {
    // 14. calcule o volume de uma lata de óleo, utilizando a formula(pi*r2*altura)
    public static void main(String[] args) {
        double raio = 3.4;
        double altura = 2.3;

        double volume = Math.PI * (raio*raio) * altura;
        System.out.println("O volume: " + volume);
    }
}
