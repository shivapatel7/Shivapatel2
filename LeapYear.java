package CollectionsJava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter year ");
        int year = sc.nextInt();
        boolean is = false;

        if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
            System.out.format("is a Leap Year", year);
        }
        else {
            System.out.format("is NOT a Leap Year. ", year);
        }
        }
    }

