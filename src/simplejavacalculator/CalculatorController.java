package simplejavacalculator;

public class CalculatorController {
    private final BinaryCalculator binaryCalculator;
    private final UnaryCalculator unaryCalculator;

    public CalculatorController() {
        this.binaryCalculator = new BinaryCalculator();
        this.unaryCalculator = new UnaryCalculator();
    }

    public Double performBinaryOperation(String operation, Double num1, Double num2) {
        Operation op = OperationFactory.createBinaryOperation(operation);
        return binaryCalculator.calculate(op, num1, num2);
    }

    public Double performUnaryOperation(String operation, Double num) {
        Operation op = OperationFactory.createUnaryOperation(operation);
        return unaryCalculator.calculate(op, num);
    }
}
