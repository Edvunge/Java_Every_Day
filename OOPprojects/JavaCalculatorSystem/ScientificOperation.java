package OOPprojects.JavaCalculatorSystem;

// Classe abstrata para operações cientificas (um operando)
abstract class ScientificOperation extends BaseOperation{
    public ScientificOperation(String name, String description) {
        super(name, description);
    }

    @Override
    public boolean isValidInput(double... operands) {
        return operands != null && operands.length == 1;
    }
}
