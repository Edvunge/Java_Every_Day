package OOPprojects.JavaCalculatorSystem;

public class Division extends BasicOperation {
    public Division() {
        super("", "Soma dois números");
    }

    @Override
    public double execute(double... operands) {
        if (!isValidInput(operands)) {
            throw new IllegalArgumentException("Adição requer exatamente 2 operandos");
        }
        return operands[0] + operands[1];
    }
}
