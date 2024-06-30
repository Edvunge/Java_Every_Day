package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter07_MethodsAndClasses.OverloadingMethods;

public class Box {
    double width;
    double height;
    double depth;

    // this is the constructor for box
    Box (double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    Box () {
        width  = -1;
        height = -1;
        depth  = -1;
    }

    Box (double len) {
        width = height = depth = len;
    }
}
