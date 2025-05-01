package Freecodecamp.theJavaHandbook.how5_toStrings;

public class ReplaceMethod {
    public static void main(String[] args) {
        String loremIpsumStd = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.";

        System.out.println(String.format("Standard lorem ipsum text: %s", loremIpsumStd));

        String loremIpsumHalfTranslated = loremIpsumStd.replace("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium", "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system");

        System.out.println(String.format("Translated lorem ipsum text: %s", loremIpsumHalfTranslated));
    }
}
