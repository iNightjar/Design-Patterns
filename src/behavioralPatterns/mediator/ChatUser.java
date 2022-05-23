package behavioralPatterns.mediator;

public class ChatUser extends User{
    public ChatUser(IChatRoom room, String id, String name)
    {
        super(room, id ,name);
    }
    @Override
    public void sendMessage(String message, String userId)
    {
        System.out.println(this.getName() + " ::: Sending Message : " + message);
        getMediator().sendMessage(message, userId);
    }
    public void receiveMessage( String message)
    {
        System.out.println(this.getName() + " ::: Receiving Message : " + message);
    }
}
