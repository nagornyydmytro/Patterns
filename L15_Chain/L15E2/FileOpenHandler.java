package L15_Chain.L15E2;

public abstract class FileOpenHandler {

    protected FileOpenHandler next;

    public FileOpenHandler setNext(FileOpenHandler next) {
        this.next = next;
        return next;
    }

    public void open(String fileName) {
        if (canOpen(fileName)) {
            process(fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("No program found for file: " + fileName);
        }
    }

    protected abstract boolean canOpen(String fileName);

    protected abstract void process(String fileName);
}