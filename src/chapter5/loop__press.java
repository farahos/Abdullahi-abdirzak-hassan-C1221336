package chapter5;
import java.util.Scanner;

public class loop__press {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer (The input Ends if press 5");
        int num1=input.nextInt();
        int Mult=1;
        while(num1!=5){
           Mult*=num1;
            System.out.println("Enter integer (The input Ends if press 5");
          num1=input.nextInt();


       }
       System.out.println("The Multipilication is: "+Mult);



        /// ------for
//        for(int i=0;num1!=5;){
//            Mult*=num1;
//            System.out.println("Enter integer (The input Ends if press 5");
//            num1=input.nextInt();
//
//
//        }
//
//
//        System.out.println("The Multipilication is: "+Mult);
//
//
//
//
//        // -----Do While
//
//        do{
//            Mult*=num1;
//            System.out.println("Enter integer (The input Ends if press 5");
//            num1=input.nextInt();
//        }while (num1!=5);
//        System.out.println("The Multipilication is: "+Mult);
    }
}
