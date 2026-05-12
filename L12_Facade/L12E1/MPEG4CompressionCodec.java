package L12_Facade.L12E1;

/**
 * Кодек для стиснення відео формату MPEG4
 */
public class MPEG4CompressionCodec implements Codec {

    @Override
    public String type() {
        return "mp4";
    }
}