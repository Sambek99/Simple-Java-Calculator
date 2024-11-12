package simplejavacalculator;

public interface CalculatorService {
    Double calculateBinary(BinaryOperation operation, Double num1, Double num2);
    Double calculateUnary(UnaryOperation operation, Double num);
}
