package behavioralPatterns.mediator;

public class Pattern {
    public static void main(String[] args) {
        IChatRoom chatroom = new ChatRoom();
        User hacker = new ChatUser(chatroom, "1", "hacker");
        User victom = new ChatUser(chatroom, "2", "victom");
        chatroom.addUser(hacker);
        chatroom.addUser(victom);
        
        hacker.sendMessage("Your Data is now Encrypted", "2");
        // victom.receiveMessage("hello victom");
        // victom.sendMessage("hello hacker", "1");
    }
}
