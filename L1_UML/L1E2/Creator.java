package L1_UML.L1E2;
public abstract class Creator {

    public void someOperation() {
        Product p = createProduct();
        p.doSomething();
    }

    public abstract Product createProduct();
}