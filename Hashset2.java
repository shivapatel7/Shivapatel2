package CollectionsJava;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);
        set1.add(10);
        System.out.println(set1);
        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(4);
        System.out.println(set2);
        //union
        //set1.addAll(set2);
        //System.out.println(" union "+set1);
        //Intersection
        //set1.retainAll(set2);
        //System.out.println("intersection "+set1);
        //differance
        set1.retainAll(set2);
        System.out.println(" differance " + set1);
    }
}


