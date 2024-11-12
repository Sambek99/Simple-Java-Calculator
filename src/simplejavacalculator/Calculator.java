package simplejavacalculator;

public class Calculator {
    private final CalculatorService binaryService = new BinaryCalculator();
    private final CalculatorService unaryService = new UnaryCalculator();

    public Double calculate(String operationType, Double... nums) {
        Operation operation = OperationFactory.createOperation(operationType);

        if (operation instanceof BinaryOperation && nums.length == 2) {
            return binaryService.calculateBinary((BinaryOperation) operation, nums[0], nums[1]);
        } else if (operation instanceof UnaryOperation && nums.length == 1) {
            return unaryService.calculateUnary((UnaryOperation) operation, nums[0]);
        } else {
            throw new IllegalArgumentException("Número incorrecto de argumentos para la operación: " + operationType);
        }
    }
}
