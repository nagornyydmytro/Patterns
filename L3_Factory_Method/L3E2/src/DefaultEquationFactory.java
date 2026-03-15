package L3_Factory_Method.L3E2.src;

import java.util.List;

public class DefaultEquationFactory extends EquationFactory {

    @Override
    public Equation createEquation(List<Double> coefficients) {
        if (coefficients.size() == 2) {
            return new Equation(coefficients.get(0), coefficients.get(1));
        }

        if (coefficients.size() == 3) {
            return new QuadraticEquation(
                    coefficients.get(0),
                    coefficients.get(1),
                    coefficients.get(2)
            );
        }

        if (coefficients.size() == 5) {
            return new BiQuadraticEquation(
                    coefficients.get(0),
                    coefficients.get(2),
                    coefficients.get(4)
            );
        }

        throw new IllegalArgumentException("Unsupported equation format: " + coefficients);
    }
}