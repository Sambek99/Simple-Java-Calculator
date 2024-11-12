package simplejavacalculator;

public class Cosine implements Operation {
    @Override
    public Double execute(Double num1, Double num2) {
        return Math.cos(Math.toRadians(num1));
    }
}
