package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

public class Exerc17 {
    //  16. Faça um algoritmo que leia dois valores para as variáveis A e B e efetue a troca
    //  dos valores de forma que a variável A passe a possuir o valor da variável B e a
    //  variável B passe a possuir o valor da variável A. Apresente os valores trocados.
    public static void main(String[] args) {
        int x = 4;
        int y = 9;
        int z;

        System.out.println("valor de x: " + x);
        System.out.println("valor de y: " + y);

        z = x;
        x = y;
        y = z;

        System.out.println("depois da troca:\n");
        System.out.println("valor de x: " + x);
        System.out.println("valor de y: " + y);
    }
}
