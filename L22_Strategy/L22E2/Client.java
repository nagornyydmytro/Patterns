package L22_Strategy.L22E2;

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperationStrategy(new AddStrategy());
        calculator.calculate(12, 13);

        calculator.setOperationStrategy(new SubtractStrategy());
        calculator.calculate(12, 13);

        calculator.setOperationStrategy(new MultiplyStrategy());
        calculator.calculate(12, 13);
    }
}