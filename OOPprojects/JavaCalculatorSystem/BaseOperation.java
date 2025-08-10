package OOPprojects.JavaCalculatorSystem;

// Classe abstrata base para operações
abstract class BaseOperation implements Operation, Describable {
    protected String name;
    protected String description;

    public BaseOperation(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public boolean isValidInput(double... operands) {
        return operands != null && operands.length > 0;
    }
}
