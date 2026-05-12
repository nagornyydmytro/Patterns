package L15_Chain.L15E3;

public class Client {

    public static void main(String[] args) {

        CalculationRequest[] requests = {
                new CalculationRequest(10, 5, "+"),
                new CalculationRequest(10, 5, "-"),
                new CalculationRequest(10, 5, "*"),
                new CalculationRequest(10, 5, "/"),
                new CalculationRequest(10, 0, "/"),
                new CalculationRequest(10, 5, "%")
        };

        OperationHandler additionHandler = new AdditionHandler();
        OperationHandler subtractionHandler = new SubtractionHandler();
        OperationHandler multiplicationHandler = new MultiplicationHandler();
        OperationHandler divisionHandler = new DivisionHandler();

        additionHandler
                .setNext(subtractionHandler)
                .setNext(multiplicationHandler)
                .setNext(divisionHandler);

        for (CalculationRequest request : requests) {
            additionHandler.handle(request);
        }
    }
}