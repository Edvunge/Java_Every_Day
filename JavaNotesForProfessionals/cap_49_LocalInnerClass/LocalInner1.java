package JavaNotesForProfessionals.cap_49_LocalInnerClass;

public class LocalInner1 {
    private int data = 30;

    void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }
}
