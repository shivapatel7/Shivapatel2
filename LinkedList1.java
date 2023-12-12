package CollectionsJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add('k');
        l.add("shiva");
        l.add(true);
        l.add(1000.98);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.addFirst("brother");
        l.addLast("hello");
        System.out.println(l);
        l.set(3,'l');
        System.out.println(l);
        System.out.println( l.contains('l'));
        System.out.println(l.contains('p'));
        System.out.println(l.isEmpty());
        System.out.println("using for to print valus in LinkedList");
        for( int i=0;i<l.size();i++)
        {

            System.out.println(l.get(i));
        }
        System.out.println("using foreach loop to print valus in LinkedList");
        for (Object k:l){
            System.out.println(k);
        }
        System.out.println("using Iterator loop to print valus in LinkedList");
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
