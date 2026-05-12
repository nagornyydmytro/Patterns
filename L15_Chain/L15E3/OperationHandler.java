package L15_Chain.L15E3;

public abstract class OperationHandler {

    protected OperationHandler next;

    public OperationHandler setNext(OperationHandler next) {
        this.next = next;
        return next;
    }

    public void handle(CalculationRequest request) {
        if (canHandle(request)) {
            process(request);
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Operation is not supported: " + request.getOperation());
        }
    }

    protected abstract boolean canHandle(CalculationRequest request);

    protected abstract void process(CalculationRequest request);
}