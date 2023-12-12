package CollectionsJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        // for hetrogeneous  data
       // ArrayList <Integer> a2 = new ArrayList<Integer>();
        // for homogeneous data
        a1.add(366);
        a1.add("hello");
        a1.add(663.3873);
        a1.add('h');
        System.out.println(a1);
        System.out.println(a1.size());
        System.out.println(a1.remove(1));
        a1.add(1,"broh");
        System.out.println(a1);
        System.out.println(a1.set(0,'k'));
        System.out.println(a1.get(2));
        System.out.println(a1.contains('j'));
      //  System.out.println(a1.remove('h'));
        System.out.println(" reading elements by using for loop ");
        for( int i =0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }
        System.out.println(" reading elements by using for each loop");
        for (Object e:a1){
            System.out.println(e);

        }
        System.out.println(" reading elements by using itrerator ");
        Iterator it = a1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
