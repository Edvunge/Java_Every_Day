package InstitutoFederalRNeduBR.programcaoEstruturada_OrientadaObjetos.aula05_heranca.exercs;

public class AnimalApp {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.raca = "cane corso";
        dog.nome = "max";

        dog.caminhar();

        System.out.println();

        Cachorro dog2 = new Cachorro();
        dog2.nome = "zeus";
        dog2.raca = "Pastor Alemao";
        dog2.latir();

        System.out.println();

        Gato gato = new Gato();
        gato.nome = "micha";
        gato.raca = "normal";
        gato.miar();
    }
}
