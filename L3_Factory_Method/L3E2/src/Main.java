package L3_Factory_Method.L3E2.src;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EquationFactory factory = new DefaultEquationFactory();
        EquationAnalyzer analyzer = new EquationAnalyzer(factory);

        String basePath = "L3_Factory_Method/L3E2/";
        String[] files = {"input01.txt", "input02.txt", "input03.txt"};

        for (String file : files) {
            EquationAnalysisResult result = analyzer.analyzeFile(basePath + file);
            analyzer.printReport(file, result);
        }
    }
}