package JavaCompletoPOOprojetos.AcademiaDevs.Parte_1;

public class AppPoo {
    public static void main(String[] args) throws Exception {
        People people = new People();
        people.setNome("Bob Esponja");
        people.setAltura(1.89);
        people.setIdade(23);

        //String nome = people.pegarNome();
        System.out.println(people.getNome());
        System.out.println(people.getAltura());
        System.out.println(people.getIdade());

    }
}
