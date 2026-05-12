package L9_Bridge.L9E2;

public class ImageButton extends Button {

    public ImageButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        size.applySize();
        System.out.println("Drawing an image button.\n");
    }
}