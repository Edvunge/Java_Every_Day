package CompleteIntensiveJava_AppliedToPractice.section_1_fundamentos.oop.introducaoclasses;

public class Pessoa {
    public String name;
    public int idade;
    public String email;

    public Pessoa() {

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
