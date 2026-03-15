package L3_Factory_Method.L3E2.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EquationAnalyzer {
    private final EquationFactory factory;

    public EquationAnalyzer(EquationFactory factory) {
        this.factory = factory;
    }

    public EquationAnalysisResult analyzeFile(String filePath) throws IOException {
        EquationAnalysisResult result = new EquationAnalysisResult();
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (String line : lines) {
            String trimmed = line.trim();
            if (trimmed.isEmpty()) {
                continue;
            }

            List<Double> coefficients = parseCoefficients(trimmed);
            Equation equation = factory.createEquation(coefficients);
            List<Double> roots = equation.solve();

            if (equation.hasInfiniteSolutions()) {
                result.infiniteSolutions.add(equation + " -> infinite");
                continue;
            }

            String text = equation + " -> " + roots;
            int count = roots.size();

            switch (count) {
                case 0:
                    result.zeroSolutions.add(text);
                    break;
                case 1:
                    result.oneSolution.add(text);

                    double root = roots.get(0);

                    if (result.minOneRootValue == null || root < result.minOneRootValue) {
                        result.minOneRootValue = root;
                        result.minOneRootEquation = text;
                    }

                    if (result.maxOneRootValue == null || root > result.maxOneRootValue) {
                        result.maxOneRootValue = root;
                        result.maxOneRootEquation = text;
                    }
                    break;
                case 2:
                    result.twoSolutions.add(text);
                    break;
                case 3:
                    result.threeSolutions.add(text);
                    break;
                case 4:
                    result.fourSolutions.add(text);
                    break;
                default:
                    throw new IllegalStateException("Unexpected number of roots: " + count);
            }
        }

        return result;
    }

    private List<Double> parseCoefficients(String line) {
        String[] parts = line.trim().split("\\s+");
        List<Double> coefficients = new ArrayList<>();

        for (String part : parts) {
            coefficients.add(Double.parseDouble(part));
        }

        return coefficients;
    }

    public void printReport(String fileName, EquationAnalysisResult result) {
        System.out.println("===== " + fileName + " =====");

        printGroup("No solutions", result.zeroSolutions);
        printGroup("One solution", result.oneSolution);
        printGroup("Two solutions", result.twoSolutions);
        printGroup("Three solutions", result.threeSolutions);
        printGroup("Four solutions", result.fourSolutions);
        printGroup("Infinite solutions", result.infiniteSolutions);

        System.out.println("Equation with smallest root among equations with one solution:");
        System.out.println(result.minOneRootEquation == null ? "none" : result.minOneRootEquation);

        System.out.println("Equation with largest root among equations with one solution:");
        System.out.println(result.maxOneRootEquation == null ? "none" : result.maxOneRootEquation);

        System.out.println();
    }

    private void printGroup(String title, List<String> equations) {
        System.out.println(title + " (" + equations.size() + "):");
        for (String equation : equations) {
            System.out.println("  " + equation);
        }
        System.out.println();
    }
}