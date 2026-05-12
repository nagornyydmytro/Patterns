package L15_Chain.L15E2;

public class ExcelFileHandler extends FileOpenHandler {

    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".xls") || fileName.endsWith(".xlsx");
    }

    @Override
    protected void process(String fileName) {
        System.out.println("Opening spreadsheet in Microsoft Excel: " + fileName);
    }
}