package L6_Prototype.L6E1;

public class Main {
    public static void main(String[] args) {
        Equation equation = new Equation(2, 1);
        Equation equationClone = equation.cloneEquation();

        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -3, 2);
        QuadraticEquation quadraticClone = quadraticEquation.cloneEquation();

        BiQuadraticEquation biQuadraticEquation = new BiQuadraticEquation(1, -5, 4);
        BiQuadraticEquation biQuadraticClone = biQuadraticEquation.cloneEquation();

        System.out.println("Original linear equation: " + equation);
        System.out.println("Cloned linear equation:   " + equationClone);
        System.out.println("Linear roots: " + equation.solve());
        System.out.println();

        System.out.println("Original quadratic equation: " + quadraticEquation);
        System.out.println("Cloned quadratic equation:   " + quadraticClone);
        System.out.println("Quadratic roots: " + quadraticEquation.solve());
        System.out.println();

        System.out.println("Original biquadratic equation: " + biQuadraticEquation);
        System.out.println("Cloned biquadratic equation:   " + biQuadraticClone);
        System.out.println("Biquadratic roots: " + biQuadraticEquation.solve());
    }
}