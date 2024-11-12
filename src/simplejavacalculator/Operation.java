package simplejavacalculator;

public interface Operation {
    Double execute(Double num1, Double num2); // Para operaciones binarias
    Double execute(Double num); // Para operaciones unarias
}
