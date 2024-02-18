package Java_COMPLETO_POO_Projetos.Exercicios;

public class CirculoAndCircunferencia_cls {
    /*
    3. Crie uma classe `Círculo` com atributo raio.
    Adicione métodos para calcular a área e circunferência do círculo.
    */
    public double raio;
    public final double PI = 3.1415;

    // calculo da area do circulo
    double calcularAreaDoCirculo(double raio){
        //code here | AREA = PI X RAIO AO QUADRD
        double areaDoCirculo = PI * (raio * raio);
        return areaDoCirculo;
    }

    // calculo da area de circunferencia do circulo
    double calcularAreaDaCircunferenciaDoCirculo(double raio) {
        // code here | c = 2PI*raio
        double areaDeCircunferenciaDoCirculo = (2.0 * PI * raio);
        return areaDeCircunferenciaDoCirculo;
    }
}