package L15_Chain.L15E3;

public class SubtractionHandler extends OperationHandler {

    @Override
    protected boolean canHandle(CalculationRequest request) {
        return request.getOperation().equals("-");
    }

    @Override
    protected void process(CalculationRequest request) {
        double result = request.getFirstNumber() - request.getSecondNumber();
        System.out.println(request.getFirstNumber() + " - " + request.getSecondNumber() + " = " + result);
    }
}