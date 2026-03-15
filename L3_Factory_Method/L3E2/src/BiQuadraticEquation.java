package L3_Factory_Method.L3E2.src;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BiQuadraticEquation extends QuadraticEquation {

    public BiQuadraticEquation(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public List<Double> solve() {
        if (isZero(a)) {
            QuadraticEquation reduced = new QuadraticEquation(b, 0, c);
            return reduced.solve();
        }

        QuadraticEquation equationForY = new QuadraticEquation(a, b, c);
        List<Double> yRoots = equationForY.solve();

        TreeSet<Double> roots = new TreeSet<>();

        for (double y : yRoots) {
            if (y < -EPS) {
                continue;
            }

            if (isZero(y)) {
                roots.add(0.0);
            } else {
                double sqrtY = Math.sqrt(y);
                roots.add(normalize(-sqrtY));
                roots.add(normalize(sqrtY));
            }
        }

        return new ArrayList<>(roots);
    }

    @Override
    public boolean hasInfiniteSolutions() {
        return isZero(a) && isZero(b) && isZero(c);
    }

    @Override
    public String toString() {
        return formatNumber(a) + "x^4 " + signPart(b) + "x^2 " + signPart(c) + " = 0";
    }
}