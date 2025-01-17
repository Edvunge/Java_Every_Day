package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter07_MethodsAndClasses.ObjectsAsParameters;

public class Box {
    double width;
    double height;
    double depth;

    // Notice this constructor, It takes an object of type Box.
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified
    Box() {
        width = -1;     // use -1 to indicate
        height = -1;    // an uninitialized
        depth = -1;     // box
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volune
    double volume() {
        return width * height * depth;
    }
}
