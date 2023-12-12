package CollectionsJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet s1 = new HashSet(); //default capacity is 16, load factor is 0.75
       // HashSet s2 = new HashSet(100);capacity is 100,;load factor is 0.75
      //  HashSet s3 = new HashSet(100,(float) 0.95); capacity is 100, load factoris 0.95
        s1.add("hello");
        s1.add('k');
        s1.add(100);
        s1.add(0.10);
        s1.add(true);
        s1.add('l');
        System.out.println(s1);
        s1.remove('l');
        System.out.println(s1);
        s1.add('x');
        System.out.println(s1);
        System.out.println(s1.contains('k'));
        System.out.println(s1.contains('a'));
        System.out.println(s1.isEmpty());
        for (Object k:s1){
            System.out.println(k);
        }
        Iterator i = s1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
