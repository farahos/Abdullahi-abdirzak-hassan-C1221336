package chapter4;

import java.util.Scanner;

public class intitial_character_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.next();
        if(!str.isEmpty()&& Character.isUpperCase(str.charAt(0))){
            System.out.println("Star whith upper case");

        }else
            System.out.println("not upper case");
    }
}
