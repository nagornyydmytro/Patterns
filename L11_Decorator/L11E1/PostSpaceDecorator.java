package L11_Decorator.L11E1;

public class PostSpaceDecorator extends PrintableDecorator {

    public PostSpaceDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        printable.print();
        System.out.print(" ");
    }
}