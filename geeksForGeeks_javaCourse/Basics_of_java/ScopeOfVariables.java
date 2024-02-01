package geeksForGeeks_javaCourse.Basics_of_java;

public class ScopeOfVariables {
    static int x = 11;
    private int y = 33;
    public void method1(int x){
        ScopeOfVariables scope_of_variables = new ScopeOfVariables();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + ScopeOfVariables.x);
        System.out.println("scope_of_variables.x: " + scope_of_variables.x);
        System.out.println("scope_of_variables.y: " + scope_of_variables.y);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        ScopeOfVariables scope_of_variables = new ScopeOfVariables();
        scope_of_variables.method1(9);
    }
}
