package ESTUDOS;

public class TEST {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j ==5) {
                    break outer;
                    // breaks out of outer loop instead of only the inner one
                }
            }
        }
    }
}
