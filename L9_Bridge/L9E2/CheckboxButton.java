package L9_Bridge.L9E2;

public class CheckboxButton extends Button {

    public CheckboxButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        size.applySize();
        System.out.println("Drawing a checkbox button.\n");
    }
}