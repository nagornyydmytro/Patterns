package L16_Command.L16E2;

public class PrintDocumentCommand implements Command {

    private final Document document;

    public PrintDocumentCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }
}