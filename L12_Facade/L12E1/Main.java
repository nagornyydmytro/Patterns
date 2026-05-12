package L12_Facade.L12E1;

public class Main {

    public static void main(String[] args) {

        String fileName = "youtubevideo.ogg";

        VideoFile videoFile = new VideoFile(fileName,
                new Buffer("Byte buffer of video"),
                new Buffer("Byte buffer of audio"));

        videoFile.play(new MPEG4CompressionCodec()); // програємо файл не правильним кодеком
//        videoFile.play(new OggCompressionCodec());   // програємо файл правильним кодеком

        VideoConversionFacade facade = new VideoConversionFacade();
        VideoFile videoFileConverted = facade.convert(videoFile, new MPEG4CompressionCodec());

        videoFileConverted.play(new MPEG4CompressionCodec());
    }
}