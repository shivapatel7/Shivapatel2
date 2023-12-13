package CollectionsJava;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(100);
        hs.add(200);
        hs.add(900);
        hs.add(900);
        hs.add(2090);
        System.out.println(hs);

    }
}
