package creationalPatterns.factory;
public class eastCostDistributor implements idistributor {
    @Override
    public void shipbook() {
        System.out.println("shipped to the east cost");
    }
}
