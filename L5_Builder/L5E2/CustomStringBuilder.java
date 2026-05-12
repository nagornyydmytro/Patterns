package L5_Builder.L5E2;

public class CustomStringBuilder {
    private String value;

    public CustomStringBuilder() {
        this.value = "";
    }

    public CustomStringBuilder append(String text) {
        value = value + text;
        return this;
    }

    public CustomStringBuilder insert(int index, String text) {
        if (index < 0 || index > value.length()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        String left = value.substring(0, index);
        String right = value.substring(index);
        value = left + text + right;

        return this;
    }

    public String build() {
        return value;
    }
}