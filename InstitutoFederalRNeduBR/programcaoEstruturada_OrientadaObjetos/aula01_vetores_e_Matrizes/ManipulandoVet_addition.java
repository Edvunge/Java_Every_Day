package InstitutoFederalRNeduBR.programcaoEstruturada_OrientadaObjetos.aula01_vetores_e_Matrizes;

public class ManipulandoVet_addition {
    public static void main(String[] args) {
        // Atribuindo um valor para um determinado elemento.
        int vetor[] = new int[6];

        vetor[0] = 19;
        vetor[1] = 10;
        vetor[2] = 90;
        vetor[3] = 11;
        vetor[4] = 15;
        vetor[5] = 199;

        // Percorrendo todos os elementos do vetor:
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + ": " + vetor[i]);
        }

        for (int w : vetor) {
            System.out.println("Elemento: " + w);
        }

        // Existem outras formas de criar vetores já inicializando seus elemenntos
        // com determinados valores

        int vetor2[] = new int[] {10, 20, 30};
        int[] vetor3 = {10, 20, 30};
    }
}
