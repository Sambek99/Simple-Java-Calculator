package simplejavacalculator;

public interface Operation {
    /**
     * Ejecuta una operación matemática.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return El resultado de la operación.
     */
    Double execute(Double num1, Double num2);
}
