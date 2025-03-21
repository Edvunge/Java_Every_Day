package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter07_MethodsAndClasses.ObjectsAsParameters;

public class OverloadCons2 {
    public static void main(String[] args) {
        // create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);  // create copy of mybox1

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("volume of mybox2 is " + vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("volume of mycube is " + vol);

        // get volume of clone
        vol = myclone.volume();
        System.out.println("volume of myclone is " + vol);
    }
}
