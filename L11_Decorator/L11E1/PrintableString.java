package L11_Decorator.L11E1;

public class PrintableString implements Printable {
    private final String base;

    public PrintableString(String base) {
        this.base = base;
    }

    public String getBase() {
        return base;
    }

    @Override
    public void print() {
        System.out.print(base);
    }
}