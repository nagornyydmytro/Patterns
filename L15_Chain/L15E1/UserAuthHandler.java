package L15_Chain.L15E1;

import java.util.Map;

public class UserAuthHandler extends AuthHandler {

    private final Map<String, String> usersAccounts;

    public UserAuthHandler(Map<String, String> usersAccounts) {
        this.usersAccounts = usersAccounts;
    }

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.User;
    }

    @Override
    protected void process(Account account) {
        String passwordFromUserStorage = usersAccounts.get(account.getLogin());

        if (account.getPassword().equals(passwordFromUserStorage)) {
            System.out.println("User access provided: " + account.getLogin());
        } else {
            System.out.println("Access denied: " + account.getLogin());
        }
    }
}