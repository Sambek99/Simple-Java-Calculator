package simplejavacalculator;

public class BinaryCalculator {

    public Double calculate(BinaryOperation operation, Double num1, Double num2) {
        return operation.execute(num1, num2);
    }
}
