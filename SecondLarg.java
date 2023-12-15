package CollectionsJava;


import java.util.Arrays;

public class SecondLarg {
    public static void main(String[] args) {

        int[] x={27,23,232,3,777,2983273};

        System.out.println(xy(x,6));

    }
    public static int xy(int[] x,int total){
        Arrays.sort(x);
        return x[total-2];
    }
}