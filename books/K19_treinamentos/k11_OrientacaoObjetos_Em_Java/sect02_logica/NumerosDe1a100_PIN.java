package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect02_logica;

public class NumerosDe1a100_PIN {
    public static void main(String[] args) {
        for (int cont = 0; cont <= 100; cont++) {
            if (cont  % 4 == 0) {
                System.out.println("PIN");
            } else {
                System.out.println(cont);
            }
        }
    }
}
