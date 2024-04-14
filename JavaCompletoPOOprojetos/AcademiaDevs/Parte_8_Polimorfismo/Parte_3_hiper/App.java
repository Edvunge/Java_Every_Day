package JavaCompletoPOOprojetos.AcademiaDevs.Parte_8_Polimorfismo.Parte_3_hiper;

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme("Lagoa Azul");
        filme.play();
        filme.play("japones");
        filme.play("ingles");

        Serie serie = new Serie("The last of us", 2, 10);
        serie.play();
        System.out.println(serie);
    }
}
