package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box(4, 6, 8);
        Box myBox2 = new Box(9, 5, 3);

        // assign values to mybox1's instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // assign values to mybox2's instance variables
        myBox2.width  = 3;
        myBox2.height = 6;
        myBox2.depth  = 9;

        // display volume of first box
        myBox1.volume();

        // display volume of second box
        myBox2.volume();
    }
}
