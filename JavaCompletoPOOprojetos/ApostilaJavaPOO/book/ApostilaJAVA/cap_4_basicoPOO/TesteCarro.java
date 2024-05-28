package JavaCompletoPOOprojetos.ApostilaJavaPOO.book.ApostilaJAVA.cap_4_basicoPOO;

public class TesteCarro {
    public static void main(String[] args) {
        Carro meucarro = new Carro();
        meucarro.cor = "Verde";
        meucarro.modelo = "Fusca";
        meucarro.velocidadeAtual = 0;
        meucarro.velocidadeMaxima = 80;

        // liga o carro
        meucarro.liga();

        // acelera o carro
        meucarro.acelera(20);
        System.out.println(meucarro.velocidadeAtual);
    }
}
