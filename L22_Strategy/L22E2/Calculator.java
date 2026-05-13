package L22_Strategy.L22E2;

public class Calculator {

    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int calculate(int a, int b) {
        if (operationStrategy == null) {
            System.out.println("Operation strategy is not selected.");
            return 0;
        }

        return operationStrategy.execute(a, b);
    }
}