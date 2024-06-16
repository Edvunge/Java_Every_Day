package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // assign values to mybox's instance variables
        mybox.width  = 10;
        mybox.height = 20;
        mybox.depth  = 15;

        // compute valume of box
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is " + vol);
    }
}
