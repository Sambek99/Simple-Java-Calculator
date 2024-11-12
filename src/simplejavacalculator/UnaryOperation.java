package simplejavacalculator;

public interface UnaryOperation extends Operation {
    @Override
    Double execute(Double num);  // Implementación para operaciones unarias
}
