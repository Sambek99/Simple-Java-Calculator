package simplejavacalculator;

public class SimpleJavaCalculator {

    public static void main(String[] args) {
        try {
            CalculatorUI calculatorUI = new CalculatorUI(); // Inicializa la interfaz de usuario
            calculatorUI.setVisible(true); // Hace visible la ventana de la calculadora
        } catch (Exception e) {
            System.out.println("Error al iniciar la calculadora: " + e.getMessage());
        }
    }
}
