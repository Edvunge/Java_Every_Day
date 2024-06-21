package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("volume is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("volume is " + vol);
    }
}
