package L9_Bridge.L9E2;

public class DropdownButton extends Button {

    public DropdownButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        size.applySize();
        System.out.println("Drawing a dropdown button.\n");
    }
}