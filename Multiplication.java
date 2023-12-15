package CollectionsJava;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the for multiplication");
        int n = sc.nextInt();
        for (int i =0;i<=10;i++){
            int i1 = n * i;
            System.out.println(n +"* "+i + "="+ (i1));
        }
    }


}
