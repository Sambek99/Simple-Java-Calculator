package simplejavacalculator;

public class Multiplication implements BinaryOperation {
    @Override
    public Double execute(Double num1, Double num2) {
        return num1 * num2;
    }
}
