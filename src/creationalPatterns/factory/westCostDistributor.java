package creationalPatterns.factory;
public class westCostDistributor implements idistributor {
    @Override
    public void shipbook() {
        System.out.println("shipped to the west cost");
    }
}