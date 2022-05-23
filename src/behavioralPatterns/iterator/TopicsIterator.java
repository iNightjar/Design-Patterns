package behavioralPatterns.iterator;

public interface TopicsIterator<element> {
    void reset(); // reset to the first element

    element next(); // to get the next element

    element currentElement(); // to retreive the current element

    boolean hasNext(); // to check whether there any next element
    
}
