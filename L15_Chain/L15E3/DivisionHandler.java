package L15_Chain.L15E3;

public class DivisionHandler extends OperationHandler {

    @Override
    protected boolean canHandle(CalculationRequest request) {
        return request.getOperation().equals("/");
    }

    @Override
    protected void process(CalculationRequest request) {
        if (request.getSecondNumber() == 0) {
            System.out.println("Division by zero is not allowed");
            return;
        }

        double result = request.getFirstNumber() / request.getSecondNumber();
        System.out.println(request.getFirstNumber() + " / " + request.getSecondNumber() + " = " + result);
    }
}