package chapter5;
import java.util.Scanner;

public class loop__quistions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final  int NumberOF_Questions=8;
        int Correct_Questions=0;
        int Wrong_Questions=0;
        int count=0;
        Long Start_time=System.currentTimeMillis();
        String output=" ";
        while (count<NumberOF_Questions){
            int num1=(int)(Math.random()*10);
            int num2=(int)(Math.random()*10);
            if(num1<num2){
                int num3=num1;
                num1=num2;
                num2=num3;
            }

            System.out.println("What is "+num1+" - "+num2+" ?");
            int Jawab=input.nextInt();
            if(num1-num2==Jawab){
                System.out.println("You are Correct ");
                Correct_Questions++;

            }else{
                System.out.println("You Answer is Wrong \n"+num1+" _ "+num2+ " Shoud be "+(num1-num2 ));
                Wrong_Questions++;}

            count++;
            output+="\n"+num1+ " - "+num2+" = "+Jawab+(" "+(num1-num2==Jawab?" Correct": "Wrong"));
        }
        long End=System.currentTimeMillis();
        long Time=End-Start_time;
        System.out.println("Correct Questions is:"+Correct_Questions+"\n"+"Wrong Questions is: "+Wrong_Questions+"\n"+"Time is: "+Time/1000+" Seconds\n"+output);


//
//       //for loop
//
//                final int NumberOF_Questions1 = 8;
//                int Correct_Questions1 = 0;
//                int Wrong_Questions1 = 0;
//                Long Start_time1 = System.currentTimeMillis();
//                String output1 = "";
//
//                for (int count1 = 0; count1 < NumberOF_Questions1; count1++) {
//                    int num1 = (int) (Math.random() * 10);
//                    int num2 = (int) (Math.random() * 10);
//                    if (num1 < num2) {
//                        int num3 = num1;
//                        num1 = num2;
//                        num2 = num3;
//                    }
//
//                    System.out.println("What is " + num1 + " - " + num2 + " ?");
//                    int Jawab = input.nextInt();
//                    if (num1 - num2 == Jawab) {
//                        System.out.println("You are Correct");
//                        Correct_Questions1++;
//                    } else {
//                        System.out.println("Your Answer is Wrong\n" + num1 + " - " + num2 + " should be " + (num1 - num2));
//                        Wrong_Questions1++;
//                    }
//
//                    output1 += "\n" + num1 + " - " + num2 + " = " + Jawab + (num1 - num2 == Jawab ? " Correct" : " Wrong");
//                }
//
//                long End1 = System.currentTimeMillis();
//                long Time1 = End1 - Start_time1;
//                System.out.println("Correct Questions: " + Correct_Questions1 +
//                        "\nWrong Questions: " + Wrong_Questions1 +
//                        "\nTime: " + Time1/ 1000 + " seconds\n" + output1);
            }
        }



