package CollectionsJava;

import java.util.HashMap;
import java.util.Iterator;


public class HashMap1 {
    public static void main(String[] args) {
        HashMap h1 = new HashMap();
        //HashMap < Integer,String> h2 = new HashMap<Integer,String>();
        h1.put(01,"shiva");
        h1.put(02,"raj");
        h1.put(03,"vsr");
        h1.put(04,"shiv");
        h1.put(05,"sa");
        System.out.println(h1);
        System.out.println(h1.get(3));
        System.out.println(h1.isEmpty());
        h1.keySet();
        System.out.println(h1);
        for (Object i :h1.keySet()){
            System.out.println(i + "  "+h1.get(i));
        }
        for (Object  j : h1.values()){
            System.out.println(j);
        }
        Iterator i =h1.entrySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
