package simplejavacalculator;

public class Square implements Operation {
    @Override
    public Double execute(Double num1, Double num2) {
        return num1 * num1;
    }
}
