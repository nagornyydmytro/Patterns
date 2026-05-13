package L18_Mediator.L18E2;

public interface MessageMediator {
    void addUser(User user);
    void addUserToGroup(User user, String groupName);
    void sendMessageAll(String message, User userFrom);
    void sendMessage(String message, String userTo, User userFrom);
    void sendMessageToGroup(String message, String groupName, User userFrom);
}