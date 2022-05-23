package behavioralPatterns.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom {
    private Map<String, User> userMap = new HashMap<>();
    @Override 
    public void sendMessage(String message, String userId)
    {
        User user = userMap.get(userId);
        user.receiveMessage(message);
    }
    @Override
    public void addUser(User user) {
        this.userMap.put(user.getId(), user);
    }
}
