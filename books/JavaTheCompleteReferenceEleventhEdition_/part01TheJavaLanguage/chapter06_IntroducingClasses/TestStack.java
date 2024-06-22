package books.JavaTheCompleteReferenceEleventhEdition_.part01TheJavaLanguage.chapter06_IntroducingClasses;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();


        // push some numbers onto the stack
        for (int i = 0; i < 10; i++) mystack1.push(i);

        // pop those numbers off the stack
        System.out.println("stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

    }
}
