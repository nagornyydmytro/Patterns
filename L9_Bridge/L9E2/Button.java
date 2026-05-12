package L9_Bridge.L9E2;

public abstract class Button {
    protected final ButtonSize size;

    public Button(ButtonSize size) {
        this.size = size;
    }

    public abstract void draw();
}