public class UnaryCalculator implements Operation{

    public Double calculate(Operation operation, Double num) {
        return operation.execute(num, 0.0); // Para operaciones unarias, el segundo número es innecesario.
    }
}
