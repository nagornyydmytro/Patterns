package L9_Bridge.L9E2;

public class RadioButton extends Button {

    public RadioButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        size.applySize();
        System.out.println("Drawing a radio button.\n");
    }
}