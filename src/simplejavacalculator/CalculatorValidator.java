package simplejavacalculator;

public class CalculatorValidator {

    public static boolean isValidForDivision(Double num) {
        return num != 0;
    }

    public static boolean isValidForTan(Double num) {
        // Retorna verdadero solo si el ángulo es válido para la función tangente
        return !(num % 90 == 0 && num % 180 != 0);
    }
}
