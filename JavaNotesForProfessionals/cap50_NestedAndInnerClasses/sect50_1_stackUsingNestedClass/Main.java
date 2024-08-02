package JavaNotesForProfessionals.cap50_NestedAndInnerClasses.sect50_1_stackUsingNestedClass;

public class Main {
    public static void main(String[] args) {

        IntStack s = new IntStack();
        s.push(4).push(3).push(2).push(1).push(0);

        //prints: 0, 1, 2, 3, 4,
        for (int i = 0; i < 5; i++) {
            System.out.println(s.pop() + ", ");
        }
    }
}
