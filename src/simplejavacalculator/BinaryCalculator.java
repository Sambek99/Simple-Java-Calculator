package simplejavacalculator;

public class BinaryCalculator implements Operation{

    public Double calculate(Operation operation, Double num1, Double num2) {
        return operation.execute(num1, num2);
    }
}