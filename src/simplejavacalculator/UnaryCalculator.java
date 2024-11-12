package simplejavacalculator;

public class UnaryCalculator implements CalculatorService {

    @Override
    public Double calculateBinary(BinaryOperation operation, Double num1, Double num2) {
        throw new UnsupportedOperationException("UnaryCalculator no soporta operaciones binarias.");
    }

    @Override
    public Double calculateUnary(UnaryOperation operation, Double num) {
        return operation.execute(num);
    }
}
