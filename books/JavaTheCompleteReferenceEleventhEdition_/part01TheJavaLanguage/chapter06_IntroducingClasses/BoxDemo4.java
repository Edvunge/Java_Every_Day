package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box(11, 44, 66);
        Box myBox2 = new Box(22, 33, 44);
        double vol;

        // assign values to mybox1's instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // assign values to mybox2's instance variables
        myBox2.width  = 3;
        myBox2.height = 6;
        myBox2.depth  = 9;

        // display volume of first box
        vol = myBox1.volume();
        System.out.println("volume is " + vol);

        // display volume of second box
        vol = myBox2.volume();
        System.out.println("volume is " + vol);

    }
}
