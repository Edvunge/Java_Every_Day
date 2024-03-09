package JavaCompletoPOOprojetos.Exercicios.EXERCS_POO_2;

public class Ponto {
    /*
    Crie uma classe Ponto com atributos x e y. Adicione um método para calcular a distância entre dois pontos.
    */
    public double x;
    public double y;

    public double calcularDistancia(double x, double y) {
        this.x = x;
        this.y = y;

        double distance;

        if (x > y) {
            distance = x - y;
            return distance;
        } else {
           distance = y - x;
           return distance;
        }
    }

    public static void main(String[] args) {
        Ponto ponto = new Ponto();
        ponto.y = 2.3;
        ponto.x = 7.3;

        System.out.format("A distancia entre: %.2f e %.2f = %.2f",ponto.x ,ponto.y ,ponto.calcularDistancia(ponto.x, ponto.y));
    }
}
