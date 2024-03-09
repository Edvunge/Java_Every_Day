package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.D_construtores.test;


import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.D_construtores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akunama Drive", "TV", 12, "Acção");
    //    anime.init("Akunama Drive", "TV", 12, "Acção");
        anime.imprime();
    }
}
