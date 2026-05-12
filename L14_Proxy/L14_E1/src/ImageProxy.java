package L14_Proxy.L14_E1.src;

/**
 * Замісник зображення.
 * Не завантажує файл до моменту безпосереднього відображення.
 */
public class ImageProxy implements DisplayObject {

    final private String path;
    private ImageFile imageFile;

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (imageFile == null) {
            imageFile = new ImageFile(path);
        }
        imageFile.display();
    }
}