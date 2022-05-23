package creationalPatterns.singelton;

class singelton {
    public String message;
    private singelton() {
        message = "Hacker";
        System.out.println(message);
        }

    private static singelton instance = null;

    public static singelton getInstance() {
        if (instance == null) {
            instance = new singelton();
        }
        return instance;
    }

    // public void displayMessage()
    // {
    //     System.out.println("Hacker");
    // }
}

public class SingeltonExample {
    public static void main(String[] args) {
        singelton.getInstance();        
    }    
}
