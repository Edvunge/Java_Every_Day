package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter07_MethodsAndClasses.CloserLookAtArgumentPassing;

public class TTest {
    int a, b;

    TTest(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(TTest o) {
        o.a *= 2;
        o.b /= 2;
    }
}
