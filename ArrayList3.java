package CollectionsJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
    public static void main(String[] args) {
        String ar []={" shiva ", "patel","welcome"};
        for ( String x :ar){
            System.out.println(x);
        }
        ArrayList a_new = new ArrayList(Arrays.asList(ar));
        System.out.println("Array after converting to ArrayList"+a_new);
    }
}
