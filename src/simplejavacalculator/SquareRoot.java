package simplejavacalculator;

public class SquareRoot implements UnaryOperation {
    @Override
    public Double execute(Double num) {
        return Math.sqrt(num);
    }
}
