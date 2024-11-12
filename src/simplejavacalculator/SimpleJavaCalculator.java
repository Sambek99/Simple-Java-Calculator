package simplejavacalculator;

public class SimpleJavaCalculator {

    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            
            // Ejemplo de uso de la calculadora
            System.out.println("Suma: " + calculator.calculate("add", 5.0, 3.0));
            System.out.println("Coseno: " + calculator.calculate("cos", 60.0));
            System.out.println("Raíz cuadrada: " + calculator.calculate("sqrt", 16.0));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
