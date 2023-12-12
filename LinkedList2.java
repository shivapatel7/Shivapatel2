package CollectionsJava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.Callable;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList <String>l1 =new LinkedList<String>();
        l1.add("hello");
        l1.add("hello1");
        l1.add("hello12");
        l1.add("hello23");
        l1.add("hello2323");
        LinkedList new1 = new LinkedList<>();
        new1.addAll(l1);
        Collections.sort(new1);
        System.out.println(new1);
        Collections.sort(new1,Collections.reverseOrder());
        System.out.println(new1);
        Collections.shuffle(new1);
        System.out.println(new1);


    }
}
