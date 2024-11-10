package chapter5;
import java.util.Scanner;

public class ganared_numbers {
    public static void main(String[] args) {
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        Scanner kb=new Scanner(System.in);
        System.out.println("What is "+num1+" + "+num2+" ?");
        int Jawab=kb.nextInt();
       while(num1+num2!=Jawab){

           System.out.println("wrong Answer.Try Again "+"What is "+num1+" + "+num2+" ?");
            Jawab=kb.nextInt();
       }
       System.out.println("Correct");



        // ---------Do While-----

//        do{
//            System.out.println("wrong Answer.Try Again "+"What is "+num1+" + "+num2+" ?");
//            Jawab=kb.nextInt();
//        }while (num1+num2!=Jawab);
//        System.out.println("Correct");


        // ---------for-----

//        for (int i=0; num1+num2!=Jawab; ) {
//            System.out.println("wrong Answer.Try Again " + "What is " + num1 + " + " + num2 + " ?");
//            Jawab = kb.nextInt();
//        }
//        System.out.println("Correct");
    }
}
