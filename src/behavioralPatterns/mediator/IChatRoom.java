package behavioralPatterns.mediator;

public interface IChatRoom {
    public void sendMessage(String message, String userId);

    void addUser(User user);
}
