package L15_Chain.L15E2;

public class ImageFileHandler extends FileOpenHandler {

    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".jpg") || fileName.endsWith(".png");
    }

    @Override
    protected void process(String fileName) {
        System.out.println("Opening image file in image viewer: " + fileName);
    }
}