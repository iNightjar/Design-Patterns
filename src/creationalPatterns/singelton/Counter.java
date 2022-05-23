package creationalPatterns.singelton;
public class Counter {
    
    public int counter = 0;

    private static Counter instance = null; // initialized in memory only when it's called 
    public static  synchronized Counter getInstance() {
            if (instance == null) {
                instance = new Counter();
            }
            return instance;
    }
    private Counter(){}
    public int addOne()
    {
        return counter++;
        //System.out.println("counter value is : "+ counter);
    }
}
