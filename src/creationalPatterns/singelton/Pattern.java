package creationalPatterns.singelton;


class firstRunning extends Thread {
    public void run() {
        try {
            Counter firstObject = Counter.getInstance();
            System.out.println("counter from firstObject : " + firstObject.addOne());
            Counter secondObject = Counter.getInstance();
            System.out.println("counter from secondObject : " + secondObject.addOne());
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }

    }

}
// class secondRunning extends Thread {
//     public void run() {
//         try {
//             Counter firstObject = Counter.getInstance();
//             System.out.println("counter from firstObject : " + firstObject.addOne());
//             Counter secondObject = Counter.getInstance();
//             System.out.println("counter from secondObject : " + secondObject.addOne());
//         }
//         catch (Exception e) {
//             System.out.println("Exception is caught");
//         }

//     }

// }
public class Pattern {
    public static void main(String[] args) {
        firstRunning one = new firstRunning();
        one.start();
        // secondRunning  two = new secondRunning();
        //  two.start();
    }
}