package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte1_classes_objects_and_attibutes;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // METODOS:
    void mostraStatus() {
        System.out.format("Personagem: %s com %d de forca no nivel %d",nome ,nivel ,forca);
    }

    void atacar(String alvo, String habilidade) {
        if (habilidade.length() == 0) {
            System.out.format("\n%s atacou %s e cursou %d de dano.\n",nome ,alvo ,forca);
        } else {
            System.out.format("\n%s usou '%s' contra %s e causou %d de dano.\n",nome ,habilidade ,alvo ,forca);
        }
    }










}
