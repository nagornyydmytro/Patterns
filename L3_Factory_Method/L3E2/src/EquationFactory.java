package L3_Factory_Method.L3E2.src;

import java.util.List;

public abstract class EquationFactory {
    public abstract Equation createEquation(List<Double> coefficients);
}