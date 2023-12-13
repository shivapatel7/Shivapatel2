package CollectionsJava;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable k = new Hashtable();
        k.put(101,"hi");
        k.put(102,"hello");
        k.put(103,"namste");
      //  k.put(null,"hi");
       // k.put(104,null);
        System.out.println(k);
        System.out.println(k.get(103));
        for (Object i:k.keySet()){
            System.out.println(i + " "+k.get(i));
        }
        Iterator i=k.values().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
