package JavaCompletoPOOprojetos.AcademiaDevs.RewiesExtras;

public class ComparandoReferencias {
    public static void main(String[] args) {
        Autor_cls autor = new Autor_cls();
        autor.nome = "Rodrigo";
        autor.email = "rodrigo.turinni@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Autor_cls autor2 = new Autor_cls();
        autor2.nome = "Rodrigo Turini";
        autor2.email = "rodrigo.turini@caelum.com.br";
        autor2.cpf = "123.456.789.10";


        if (autor == autor2) {
            System.out.println("Iguais, mesmo autor!");
        } else {
            System.out.println("hein!? Por que diferentes?");
        }
    }
}
