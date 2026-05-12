package L11_Decorator.L11E1;

public abstract class PrintableDecorator implements Printable {
    protected final Printable printable;

    public PrintableDecorator(Printable printable) {
        this.printable = printable;
    }
}