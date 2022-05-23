package behavioralPatterns.iterator;

public class ImplementationForTopicsIterator implements TopicsIterator<Topics> {
    
    private Topics[] topics;
    private int position;

    public ImplementationForTopicsIterator(Topics[] topics)
    {
        this.topics = topics;
        position = 0 ;
    }
    @Override

    public void reset() {
        position = 0;
    }
    @Override
    public Topics next() {
        return topics[position++];
    }
    @Override
    public Topics currentElement() {
        return topics[position];
    }
    @Override
    public boolean hasNext() {
        if(position >= topics.length)
            return false;
        return true;
    }
}
