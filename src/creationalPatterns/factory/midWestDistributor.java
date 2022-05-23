package creationalPatterns.factory;
public class midWestDistributor implements idistributor {
    @Override
    public void shipbook() {
        System.out.println("shipped to the middle west");
    }
}
