package L15_Chain.L15E1;

public abstract class AuthHandler {

    protected AuthHandler next;

    public AuthHandler setNext(AuthHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Account account) {
        if (canHandle(account)) {
            process(account);
        } else if (next != null) {
            next.handle(account);
        } else {
            System.out.println("Access denied: " + account.getLogin());
        }
    }

    protected abstract boolean canHandle(Account account);

    protected abstract void process(Account account);
}