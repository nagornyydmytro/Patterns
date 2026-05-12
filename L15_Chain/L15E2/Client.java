package L15_Chain.L15E2;

public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        FileOpenHandler imageHandler = new ImageFileHandler();
        FileOpenHandler wordHandler = new WordFileHandler();
        FileOpenHandler excelHandler = new ExcelFileHandler();
        FileOpenHandler powerPointHandler = new PowerPointFileHandler();
        FileOpenHandler pdfHandler = new PdfFileHandler();

        imageHandler
                .setNext(wordHandler)
                .setNext(excelHandler)
                .setNext(powerPointHandler)
                .setNext(pdfHandler);

        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            imageHandler.open(file);
        }
    }
}