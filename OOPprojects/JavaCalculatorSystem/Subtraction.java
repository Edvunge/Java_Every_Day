package OOPprojects.JavaCalculatorSystem;

public class Subtraction extends BasicOperation {
    public Subtraction() {
        super("Subtração", "Subtrai o segundo número do primeiro");
    }

    @Override
    public double execute(double... operands) {
        if (!isValidInput(operands)) {
            throw new IllegalArgumentException("Subtração requer exatamente 2 operands");
        }
        return operands[0] - operands[1];
    }
}
