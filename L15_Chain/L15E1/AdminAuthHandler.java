package L15_Chain.L15E1;

import java.util.Map;

public class AdminAuthHandler extends AuthHandler {

    private final Map<String, String> adminsAccounts;

    public AdminAuthHandler(Map<String, String> adminsAccounts) {
        this.adminsAccounts = adminsAccounts;
    }

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.Administrator;
    }

    @Override
    protected void process(Account account) {
        String passwordFromAdminsStorage = adminsAccounts.get(account.getLogin());

        if (account.getPassword().equals(passwordFromAdminsStorage) && account.getPassword().length() >= 8) {
            System.out.println("Administrator access provided: " + account.getLogin());
        } else {
            System.out.println("Access denied: " + account.getLogin());
        }
    }
}