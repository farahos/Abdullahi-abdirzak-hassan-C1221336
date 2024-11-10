

import java.util.Scanner;

public class dddd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1=(int)  ( Math.random()*10);
        int n2= (int)(Math.random()*10);

        if (n1<n2){
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        System.out.println("what is "+n1+" - "+n2+"?");
        int ans=input.nextInt();


        if (n1-n2==ans){
            System.out.println("you are correct");
        }else{
            System.out.println(n1+" - "+n2+" should be "+ans);
        }



    }
}