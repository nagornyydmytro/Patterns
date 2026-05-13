package L18_Mediator.L18E2;

public class ConcreteUser implements User {

    final private String userId;
    private MessageMediator mediator;

    public ConcreteUser(String userId) {
        this.userId = userId;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setMediator(MessageMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.sendMessageAll(message, this);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.sendMessage(message, userTo, this);
    }

    @Override
    public void sendMessageToGroup(String message, String groupName) {
        mediator.sendMessageToGroup(message, groupName, this);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}