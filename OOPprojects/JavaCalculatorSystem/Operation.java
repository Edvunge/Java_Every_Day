package OOPprojects.JavaCalculatorSystem;

// Interface base para todas as operações matemáticas
public interface Operation {
    double execute(double... operands);
    String getName();
    boolean isValidInput(double... operands);
}
