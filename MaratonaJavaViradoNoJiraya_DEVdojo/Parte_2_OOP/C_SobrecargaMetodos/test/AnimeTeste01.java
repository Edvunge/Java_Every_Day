package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.C_SobrecargaMetodos.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.C_SobrecargaMetodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akunama Drive", "TV", 12, "Acção");
        anime.imprime();
    }
}
