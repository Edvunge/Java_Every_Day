package OOPprojects.JavaCalculatorSystem;

public class Multiplication extends BasicOperation {
    public Multiplication() {
        super("Multiplicação", "Multiplica dois números");
    }

    @Override
    public double execute(double... operands) {
        if (!isValidInput(operands)) {
            throw new IllegalArgumentException("Multiplicação requer exatamente 2 operandos");
        }
        return operands[0] * operands[1];
    }
}
