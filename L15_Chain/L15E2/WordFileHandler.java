package L15_Chain.L15E2;

public class WordFileHandler extends FileOpenHandler {

    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".doc") || fileName.endsWith(".docx");
    }

    @Override
    protected void process(String fileName) {
        System.out.println("Opening text document in Microsoft Word: " + fileName);
    }
}