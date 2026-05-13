package L18_Mediator.L18E2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatMediator implements MessageMediator {

    private final Map<String, User> users = new HashMap<>();
    private final Map<String, List<User>> groups = new HashMap<>();

    @Override
    public void addUser(User user) {
        users.put(user.getUserId(), user);
        user.setMediator(this);
    }

    @Override
    public void addUserToGroup(User user, String groupName) {
        groups.putIfAbsent(groupName, new ArrayList<>());

        if (!groups.get(groupName).contains(user)) {
            groups.get(groupName).add(user);
        }
    }

    @Override
    public void sendMessageAll(String message, User userFrom) {
        for (User user : users.values()) {
            if (!user.getUserId().equals(userFrom.getUserId())) {
                user.receiveMassage(message, userFrom.getUserId());
            }
        }
    }

    @Override
    public void sendMessage(String message, String userTo, User userFrom) {
        User user = users.get(userTo);

        if (user != null) {
            user.receiveMassage(message, userFrom.getUserId());
        }
    }

    @Override
    public void sendMessageToGroup(String message, String groupName, User userFrom) {
        List<User> groupUsers = groups.get(groupName);

        if (groupUsers == null) {
            return;
        }

        for (User user : groupUsers) {
            if (!user.getUserId().equals(userFrom.getUserId())) {
                user.receiveMassage(message, userFrom.getUserId());
            }
        }
    }
}