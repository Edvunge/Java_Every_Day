package geeksForGeeks_javaCourse;
import java.io.*;

public class Variables_Second_Part {
    public String geek;
    public int i;
    public Integer I;
    public Variables_Second_Part(){
        this.geek = "Edvaldo Vunge";
    }

    // Variavel Statica
    public static String keeg = "farol gravth";

    public static void main(String[] args) {
        Variables_Second_Part name = new Variables_Second_Part();

        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for Integer is " + name.i);
        System.out.println("Geek Name is : " + Variables_Second_Part.keeg);
        System.out.println("Default value for Integer is " + name.I);

        /*
        Conclusão

        Variáveis em Java são um contêiner de dados que salva os valores dos dados durante a execução do programa Java.
        Existem três tipos de variáveis em Java:
            variáveis locais, variáveis estáticas e variáveis de instância.
        */
    }
}
