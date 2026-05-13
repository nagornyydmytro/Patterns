package L16_Command.L16E2;

public class SaveDocumentCommand implements Command {

    private final Document document;

    public SaveDocumentCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}