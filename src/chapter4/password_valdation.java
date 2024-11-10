package chapter4;

import java.util.Scanner;

public class password_valdation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = input.next();
        if(password.length()>=8){
            System.out.println("valid password");
        }else
            System.out.println("invalid password");
    }
}
