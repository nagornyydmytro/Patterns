package L16_Command.L16E2;

public class ShowDocumentInfoCommand implements Command {

    private final Document document;

    public ShowDocumentInfoCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.showInfo();
    }
}