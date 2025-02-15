package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(23, 43, 54);
        Box myBox2 = new Box(12, 13, 14);
        double vol;

        // assing values to mybox1's instance variables
        myBox1.width  = 10;
        myBox1.height = 20;
        myBox1.depth  = 15;

        // assing values to mybox2's instance variables
        myBox2.width  = 3;
        myBox2.height = 6;
        myBox2.depth  = 9;

        // compute volume of first box
        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("volume is " + vol);

        // compute volume of second box
        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("volume is " + vol);
    }
}
