package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class Box {
    double width;
    double height;
    double depth;

    // display volume of a box
    double volume() {
        //System.out.println("Volume is ");
        //System.out.println(width * height * depth);
        return width * height * depth;
    }
}
