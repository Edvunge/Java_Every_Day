package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect02_logica;

public class ExibaAsteriscos {
    public static void main(String[] args) {
        for (int cont = 1; cont <= 100; cont++) {
            int resto = cont % 2;
            if (resto == 1) {
                System.out.println("*");
            } else {
                System.out.println("**");
            }
        }
    }
}
