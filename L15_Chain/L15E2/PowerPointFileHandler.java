package L15_Chain.L15E2;

public class PowerPointFileHandler extends FileOpenHandler {

    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".ppt") || fileName.endsWith(".pptx");
    }

    @Override
    protected void process(String fileName) {
        System.out.println("Opening presentation in Microsoft PowerPoint: " + fileName);
    }
}