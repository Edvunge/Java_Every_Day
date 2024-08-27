package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter07_MethodsAndClasses.CloserLookAtArgumentPassing;

// Primitive types are passed by value.
public class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
