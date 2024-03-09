package geeksForGeeks.JavaCourse.Basics_of_java;

public class VariablesSecondPart {
    public String geek;
    public int i;
    public Integer I;
    public VariablesSecondPart(){
        this.geek = "Edvaldo Vunge";
    }

    // Variavel Statica
    public static String keeg = "farol gravth";

    public static void main(String[] args) {
        VariablesSecondPart name = new VariablesSecondPart();

        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for Integer is " + name.i);
        System.out.println("Geek Name is : " + VariablesSecondPart.keeg);
        System.out.println("Default value for Integer is " + name.I);

        /*
        Conclusão

        Variáveis em Java são um contêiner de dados que salva os valores dos dados durante a execução do programa Java.
        Existem três tipos de variáveis em Java:
            variáveis locais, variáveis estáticas e variáveis de instância.
        */
    }
}
