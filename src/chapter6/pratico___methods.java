package chapter6;

import java.util.Scanner;

public class pratico___methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] allAcounts = {12345,112233,121212};
            System.out.println("Fadlan dooro Acount ka");
            System.out.println("1: Salaam Somali Bank ");
            System.out.println("2: premier bank ");
            System.out.println("3: Dahabshiil Bank");

            int acounts = input.nextInt();
            switch (acounts){
                case 1:
                    System.out.println("Salaam Acount "+allAcounts[0]);
                    System.out.println("1 Itus haraaga Acount ka");
                    System.out.println("2 U dir acount kle lacag");
                    break;
            }

    }
}