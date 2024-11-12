package simplejavacalculator;

public class OperationFactory {

    public static Operation createOperation(String operationType) {
        switch (operationType.toLowerCase()) {
            case "add":
                return new Addition();
            case "subtract":
                return new Subtraction();
            case "cos":
                return new Cosine();
            case "sqrt":
                return new SquareRoot();
            case "multiply":
                return new Multiplication();
            case "divide":
                return new Division();
            case "square":
                return new Square();
            case "sqrt":
                return new SquareRoot();
            case "cos":
                return new Cosine();
            default:
                throw new UnsupportedOperationException("Operación no soportada: " + operationType);
        }
    }
}
