package simplejavacalculator;

public class BinaryCalculator implements CalculatorService {

    @Override
    public Double calculateBinary(BinaryOperation operation, Double num1, Double num2) {
        return operation.execute(num1, num2);
    }

    @Override
    public Double calculateUnary(UnaryOperation operation, Double num) {
        throw new UnsupportedOperationException("BinaryCalculator no soporta operaciones unarias.");
    }
}
