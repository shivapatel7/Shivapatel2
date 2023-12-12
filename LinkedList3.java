package CollectionsJava;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList l3 =new LinkedList();
        l3.add('k');
        l3.add('i');
        l3.add('c');
        l3.add('k');
        System.out.println(l3);
        l3.addLast('2');
        l3.addFirst(' ');
        System.out.println(l3);
        l3.removeFirst();
        System.out.println(l3);
        System.out.println(l3.getFirst());
        System.out.println(l3.getLast());
    }
}
