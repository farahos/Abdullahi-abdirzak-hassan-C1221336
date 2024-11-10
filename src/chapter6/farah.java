package chapter6;
import javax.swing.*;
import java.util.Scanner;

public class farah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dial up");
        double haraaga = 100;
        String dial1 = "*712*";
        int dial2 = 619964951;
        String dial3 = "*";
        int dial4 = 5;
        String dial5 = "#";
        int pinka = 1001;



        String dial = input.next();


        if(dial.equals(dial1+dial2+dial3+dial4+dial5)){
            System.out.println("uwareji $"+dial4+" numbarkan "+dial2+ " fadlan gali pinka");
            int pin = input.nextInt();
            if(pin == pinka){
                System.out.println("waxaad "+dial4+" uwarejisay numbarkan "+dial2+ " haraagagu waa $" +haraaga);
            }
        }
       // System.out.println(dial4);





    }
}
