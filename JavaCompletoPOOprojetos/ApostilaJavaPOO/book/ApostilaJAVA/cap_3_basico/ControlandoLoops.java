package JavaCompletoPOOprojetos.ApostilaJavaPOO.book.ApostilaJAVA.cap_3_basico;

public class ControlandoLoops {
    public static void main(String[] args) {

        int x = 23, y = 25;

        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um numero divisivel por 19 entre x e y");
                break;
            }
        }
    }
}
