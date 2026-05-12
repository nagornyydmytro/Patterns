package L15_Chain.L15E2;

public class PdfFileHandler extends FileOpenHandler {

    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".pdf");
    }

    @Override
    protected void process(String fileName) {
        System.out.println("Opening PDF file in PDF Viewer: " + fileName);
    }
}