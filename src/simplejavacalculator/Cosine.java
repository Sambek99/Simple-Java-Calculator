package simplejavacalculator;

public class Cosine implements UnaryOperation {
    @Override
    public Double execute(Double num) {
        return Math.cos(Math.toRadians(num));
    }
}
