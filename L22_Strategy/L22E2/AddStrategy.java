package L22_Strategy.L22E2;

public class AddStrategy implements OperationStrategy {

    @Override
    public int execute(int a, int b) {
        int result = a + b;
        System.out.printf("%s + %s = %s%n", a, b, result);
        return result;
    }
}