package L3_Factory_Method.L3E2.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equation {
    protected static final double EPS = 1e-9;

    protected final double b;
    protected final double c;

    public Equation(double b, double c) {
        this.b = b;
        this.c = c;
    }

    public List<Double> solve() {
        if (isZero(b) && isZero(c)) {
            return Collections.emptyList();
        }
        if (isZero(b)) {
            return Collections.emptyList();
        }

        List<Double> roots = new ArrayList<>();
        roots.add(normalize(-c / b));
        return roots;
    }

    public boolean hasInfiniteSolutions() {
        return isZero(b) && isZero(c);
    }

    protected static boolean isZero(double value) {
        return Math.abs(value) < EPS;
    }

    protected static double normalize(double value) {
        return isZero(value) ? 0.0 : value;
    }

    @Override
    public String toString() {
        return formatNumber(b) + "x " + signPart(c) + " = 0";
    }

    protected static String signPart(double value) {
        if (value < 0) {
            return "- " + formatNumber(-value);
        }
        return "+ " + formatNumber(value);
    }

    protected static String formatNumber(double value) {
        if (Math.abs(value - Math.rint(value)) < EPS) {
            return String.valueOf((long) Math.rint(value));
        }
        return String.format("%.4f", value);
    }
}