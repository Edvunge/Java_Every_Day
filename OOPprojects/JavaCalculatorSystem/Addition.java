package OOPprojects.JavaCalculatorSystem;

class Addition extends BasicOperation {
    public Addition() {
        super("Adição", "Soma dois números");
    }

    @Override
    public double execute(double... operands) {
        if (!isValidInput(operands)) {
            throw new IllegalArgumentException("Adição requer exatamente 2 operandos");
        }
        return operands[0] + operands[1];
    }
}
