package simplejavacalculator;

public class Addition implements BinaryOperation {
    @Override
    public Double execute(Double num1, Double num2) {
        return num1 + num2;
    }
}
