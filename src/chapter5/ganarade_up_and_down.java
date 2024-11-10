package chapter5;
import java.util.Scanner;
public class ganarade_up_and_down {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100);
        System.out.println("ener number");
        System.out.println(num1);
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt();
       while (num1 != ans) {
           if (num1 > ans) {
               System.out.println("Wuu Kaa koreeyaa");

           } else if (num1 < ans) {
               System.out.println("Wuu Kaa hooseeyaa");}
            ans = input.nextInt();
       }
       System.out.println("sax");


        /// --------- for
//        for (int i = 0; num1 != ans; ) {
//
//            if (num1 > ans) {
//                System.out.println("Wuu Kaa koreeyaa");
//            } else if (num1 < ans) {
//                System.out.println("Wuu Kaa hooseeyaa");
//
//            }
//            ans = input.nextInt();
//        }
//        System.out.println("sax");



        // ---------Do While-----

//        do {
//            if (num1 > ans) {
//                System.out.println("Wuu Kaa koreeyaa");
//            } else if (num1 < ans) {
//                System.out.println("Wuu Kaa hooseeyaa");
//
//            }
//            ans = input.nextInt();
//        }while (num1 != ans);
//        System.out.println("sax");
    }
}
