package simplejavacalculator;

public class Calculator {

    private final BinaryCalculator binaryCalculator = new BinaryCalculator();
    private final UnaryCalculator unaryCalculator = new UnaryCalculator();

    public Double calculateBinary(BinaryCalculator.BiOperatorModes mode, Double num1, Double num2) {
        return binaryCalculator.calculate(mode, num1, num2);
    }

    public Double calculateUnary(UnaryCalculator.MonoOperatorModes mode, Double num) {
        return unaryCalculator.calculate(mode, num);
    }

    public Double reset() {
        // Retorna NaN como estado de "reinicio"
        return Double.NaN;
    }
}
