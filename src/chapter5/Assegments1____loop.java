package chapter5;

import java.util.Scanner;

public class Assegments1____loop {
    public static void main(String[] args) {
        printprimebetween(1,11);
    }
    public static  boolean isparime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

                return true;
            }


    public static void printprimebetween(int start, int end){
        for (int i = start; i<=end; i++)
            if (isparime(i))
                System.out.println(i+"");

    }
}