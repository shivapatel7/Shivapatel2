package CollectionsJava;

import java.util.PriorityQueue;
import java.util.Properties;

public class Queue1 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add("hello");
        p.add("broh");
        p.offer("hehehe");
        p.offer("broh");
        System.out.println(p);
        // we cant add hetrogenious elements in PriorityQuese if we want use LinkedaList

        // get head element

        //  System.out.println(p.element());// return header element ,if p is empty it will retrun exception
       // System.out.println(p.peek()); // return header element, if p is empty it will return null
       // return and remove methods
      //  System.out.println(p.remove()); // teturn and remove ,if p is empty it will retuen exception
        System.out.println(p);
        System.out.println(p.poll());//teturn and remove ,if p is empty it will retuen null

    }
}
