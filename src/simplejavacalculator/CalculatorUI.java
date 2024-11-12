package simplejavacalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame {
    private final CalculatorController controller;

    public CalculatorUI() {
        this.controller = new CalculatorController();
        initializeUI();
    }

    private void initializeUI() {
        // Configuración de botones y paneles
        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double result = controller.performBinaryOperation("add", getNum1(), getNum2());
                displayResult(result);
            }
        });
        
        // Configuración similar para otros botones de operación
    }

    private Double getNum1() {
        // Obtiene el primer número de la entrada de usuario
        return Double.parseDouble(/* código para obtener el número de un campo de texto */);
    }

    private Double getNum2() {
        // Obtiene el segundo número de la entrada de usuario
        return Double.parseDouble(/* código para obtener el número de otro campo de texto */);
    }

    private void displayResult(Double result) {
        // Muestra el resultado en la interfaz de usuario
        System.out.println("Resultado: " + result);
    }
}
