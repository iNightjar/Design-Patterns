package behavioralPatterns.iterator;

public class ImplementationForListIterator implements ListIterator<Topics> {
    private Topics[] topics;
    public ImplementationForListIterator(Topics[] topics)
    {
        this.topics = topics;
    }
    @Override
    public TopicsIterator<Topics> instance() {
        return new ImplementationForTopicsIterator(topics);
    }
    
}
