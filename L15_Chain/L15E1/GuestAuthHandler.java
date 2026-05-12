package L15_Chain.L15E1;

public class GuestAuthHandler extends AuthHandler {

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.Guest;
    }

    @Override
    protected void process(Account account) {
        System.out.println("Guest access provided!");
    }
}