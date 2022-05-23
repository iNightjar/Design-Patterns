package behavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

// looping throw arraylist with iterator interface
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayOfNames = new ArrayList<String>();
        arrayOfNames.add("hacker");
        arrayOfNames.add("pentester");
        arrayOfNames.add("redTeamer");
        arrayOfNames.add("incident responcer");
        Iterator<String> loopingThrowArrayOfNames = arrayOfNames.iterator();
        // print the first name
        System.out.println(loopingThrowArrayOfNames.next());
        
    }

}