package OOPprojects.JavaCalculatorSystem;

// Classe abstrata para operações basicas (dois operandos)
abstract class BasicOperation extends BaseOperation {
    public BaseOperation(String name, String description) {
        super(name, description);
    }

    @Override
    public boolean isValidInput(double... operands) {
        return operands != null && operands.length == 2;
    }
}
