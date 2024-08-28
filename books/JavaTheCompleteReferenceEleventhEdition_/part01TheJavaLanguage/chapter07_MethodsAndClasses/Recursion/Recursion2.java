package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter07_MethodsAndClasses.Recursion;

public class Recursion2 {
    public static void main(String[] args) {
        RecTest observ = new RecTest(20);
        int j;

        for (j = 0; j < 20; j++) observ.values[j] = j;

        observ.printArray(20);
    }
}
