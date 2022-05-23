package behavioralPatterns.mediator;

// user class
public abstract class User {
    private IChatRoom mediator;
    private String id;
    private String name;

    public User(IChatRoom room, String id, String name) {
        this.mediator = room;
        this.id = id;
        this.name = name;
    }

    public abstract void sendMessage(String message, String userId);
    public abstract void receiveMessage(String message);

    public IChatRoom getMediator() {
        return mediator;
    }

    public String getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }
}
