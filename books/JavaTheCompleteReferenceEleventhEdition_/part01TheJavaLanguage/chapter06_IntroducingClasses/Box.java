package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class Box {
    double width;
    double height;
    double depth;


    Box(double w, double h, double d) {
        System.out.println("Constructing Box");
        width  = w;
        height = h;
        depth  = d;
    }

    // display volume of a box
    double volume() {
        return width * height * depth;
    }
}
