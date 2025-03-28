package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect02_logica;

public class ExibeNumerosDe1Ate100 {
    public static void main(String[] args) {
        for (int cont = 1; cont <= 100; cont++){
            if (cont % 2 == 0) {
                System.out.println("**");
            } else {
                System.out.println("*");
            }
        }
    }
}
