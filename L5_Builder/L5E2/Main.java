package L5_Builder.L5E2;

public class Main {
    public static void main(String[] args) {
        CustomStringBuilder builder = new CustomStringBuilder();

        String result = builder
                .append("Hello")
                .append(" world")
                .insert(5, ",")
                .insert(0, "Start: ")
                .build();

        System.out.println(result);
    }
}