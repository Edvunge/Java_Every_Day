package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // initialize each box
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("volume is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("volume is " + vol);
    }
}
