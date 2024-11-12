package simplejavacalculator;

public class Division implements BinaryOperation {
    @Override
    public Double execute(Double num1, Double num2) {
        if (num2 == 0) {
            return Double.NaN;  // Controlamos la división entre cero
        }
        return num1 / num2;
    }
}
