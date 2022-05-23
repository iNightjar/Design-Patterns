
package behavioralPatterns.iterator;


public class Pattern {
    public static void main(String[] args) {
        Topics[] topics = new Topics[2];
        topics[0] = new Topics("cyberSecurity");
        topics[1] = new Topics("design patterns");
        ListIterator<Topics> firstList = new ImplementationForListIterator(topics);
        TopicsIterator<Topics> firstIterator = firstList.instance();
        while (firstIterator.hasNext()) {
            Topics currentTopics = firstIterator.next();
            System.out.println(currentTopics.getName());

        }
    }
}
