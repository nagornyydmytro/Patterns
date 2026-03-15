package L3_Factory_Method.L3E2.src;

import java.util.ArrayList;
import java.util.List;

public class EquationAnalysisResult {
    public final List<String> zeroSolutions = new ArrayList<>();
    public final List<String> oneSolution = new ArrayList<>();
    public final List<String> twoSolutions = new ArrayList<>();
    public final List<String> threeSolutions = new ArrayList<>();
    public final List<String> fourSolutions = new ArrayList<>();
    public final List<String> infiniteSolutions = new ArrayList<>();

    public String minOneRootEquation;
    public Double minOneRootValue;

    public String maxOneRootEquation;
    public Double maxOneRootValue;
}