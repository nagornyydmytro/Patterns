package L3_Factory_Method.L3E2.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuadraticEquation extends Equation {
    protected final double a;

    public QuadraticEquation(double a, double b, double c) {
        super(b, c);
        this.a = a;
    }

    @Override
    public List<Double> solve() {
        if (isZero(a)) {
            return super.solve();
        }

        double d = b * b - 4 * a * c;
        if (d < -EPS) {
            return Collections.emptyList();
        }

        List<Double> roots = new ArrayList<>();
        if (isZero(d)) {
            roots.add(normalize(-b / (2 * a)));
        } else {
            double sqrtD = Math.sqrt(d);
            double x1 = normalize((-b - sqrtD) / (2 * a));
            double x2 = normalize((-b + sqrtD) / (2 * a));

            if (x1 <= x2) {
                roots.add(x1);
                roots.add(x2);
            } else {
                roots.add(x2);
                roots.add(x1);
            }
        }

        return roots;
    }

    @Override
    public boolean hasInfiniteSolutions() {
        if (isZero(a)) {
            return super.hasInfiniteSolutions();
        }
        return false;
    }

    @Override
    public String toString() {
        return formatNumber(a) + "x^2 " + signPart(b) + "x " + signPart(c) + " = 0";
    }
}