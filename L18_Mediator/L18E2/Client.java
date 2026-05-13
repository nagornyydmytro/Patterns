package L18_Mediator.L18E2;

public class Client {

    public static void main(String[] args) {

        ConcreteUser user1 = new ConcreteUser("User1");
        ConcreteUser user2 = new ConcreteUser("User2");
        ConcreteUser user3 = new ConcreteUser("User3");
        ConcreteUser user4 = new ConcreteUser("User4");

        MessageMediator mediator = new ChatMediator();

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        mediator.addUserToGroup(user1, "admins");
        mediator.addUserToGroup(user2, "admins");

        mediator.addUserToGroup(user3, "moderators");
        mediator.addUserToGroup(user4, "moderators");

        user1.sendMessageAll("Hello, world!");
        user2.sendMessage("Hello!", "User1");

        user1.sendMessageToGroup("Admin message", "admins");
        user3.sendMessageToGroup("Moderator message", "moderators");
    }
}