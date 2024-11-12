package simplejavacalculator;

public class OperationFactory {

    public static Operation createBinaryOperation(String operation) {
        switch (operation) {
            case "add":
                return new Addition();
            case "subtract":
                return new Subtraction();
            case "multiply":
                return new Multiplication();
            case "divide":
                return new Division();
            default:
                throw new UnsupportedOperationException("Operación binaria no soportada: " + operation);
        }
    }

    public static Operation createUnaryOperation(String operation) {
        switch (operation) {
            case "square":
                return new Square();
            case "sqrt":
                return new SquareRoot();
            case "cos":
                return new Cosine();
            // Agrega aquí más operaciones unarias
            default:
                throw new UnsupportedOperationException("Operación unaria no soportada: " + operation);
        }
    }
}
