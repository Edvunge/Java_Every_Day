package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter07_MethodsAndClasses.Recursion;

public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    // display array - recursively
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
