package L14_Proxy.L14_E1.src;

public class ImageGallery {

    public static void main(String[] args) {
        // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
        String path = "L14_Proxy/L14_E1/resources/";

        DisplayObject[] images = {
                new ImageProxy(path + "image1.jpeg"),
                new ImageProxy(path + "image2.jpeg"),
                new ImageProxy(path + "image3.jpeg"),
                new ImageProxy(path + "image4.jpeg"),
                new ImageProxy(path + "image5.jpeg"),
                new ImageProxy(path + "image6.jpeg"),
                new ImageProxy(path + "image7.jpeg"),
                new ImageProxy(path + "image8.jpeg"),
                new ImageProxy(path + "image9.jpeg"),
                new ImageProxy(path + "image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }

}