package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter07_MethodsAndClasses.Recursion;

// A simple example of recursion
public class Factorial {
    // this is a recursive method
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
