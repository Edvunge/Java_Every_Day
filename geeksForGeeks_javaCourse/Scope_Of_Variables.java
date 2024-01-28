package geeksForGeeks_javaCourse;

public class Scope_Of_Variables {
    static int x = 11;
    private int y = 33;
    public void method1(int x){
        Scope_Of_Variables scope_of_variables = new Scope_Of_Variables();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + Scope_Of_Variables.x);
        System.out.println("scope_of_variables.x: " + scope_of_variables.x);
        System.out.println("scope_of_variables.y: " + scope_of_variables.y);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        Scope_Of_Variables scope_of_variables = new Scope_Of_Variables();
        scope_of_variables.method1(9);
    }
}
