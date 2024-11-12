package simplejavacalculator;

public class SquareRoot implements Operation {
    @Override
    public Double execute(Double num1, Double num2) {
        if (num1 < 0) {
            return Double.NaN;  // Manejo de números negativos para evitar errores
        }
        return Math.sqrt(num1);
    }
}
