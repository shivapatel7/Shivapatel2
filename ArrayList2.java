package CollectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList x1= new ArrayList<>();
        x1.add('z');
        x1.add('y');
        x1.add('z');
        x1.add('k');
        x1.add('l');
        x1.add('a');
        ArrayList ad = new ArrayList<>();
        ad.addAll(x1);
        System.out.println(ad);
        System.out.println(" remove all from ad");
        ad.removeAll(x1);
        System.out.println("after removeing all "+ad);
        System.out.println(" sorting Array lis of " +x1);
        Collections.sort(x1);
        System.out.println(" after sorting "+x1);
        Collections.sort(x1,Collections.reverseOrder());
        System.out.println(" sorting in reverse "+x1);
         Collections.shuffle(x1);
        System.out.println("  after shuffling "+x1);
        }
    }

