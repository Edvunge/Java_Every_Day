package JavaCompletoPOOprojetos.ApostilaJavaPOO.book.ApostilaJAVA.cap_3_basico;

public class If_AND_Else {
    public static void main(String[] args) {
        int idade = 15;

        /*if (idade < 18)
            System.out.println("nao pode entrar");
        */
        System.out.println(idade);

        boolean amigoDoDono = true;
        if (idade < 18  &&  amigoDoDono == false) {
            System.out.println("nao pode entrar");
        }
    }
}
