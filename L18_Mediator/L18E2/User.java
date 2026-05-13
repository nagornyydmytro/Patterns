package L18_Mediator.L18E2;

public interface User {
    String getUserId();
    void setMediator(MessageMediator mediator);
    void sendMessageAll(String message);
    void sendMessage(String message, String userTo);
    void sendMessageToGroup(String message, String groupName);
    void receiveMassage(String message, String userFrom);
}