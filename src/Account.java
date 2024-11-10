import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Evc = 100;
        int pin = 1001;
        String dial ="*712*619964951*10#";


        String dialup = input.next();
        if(dialup.equals(dial)){
            System.out.println("u wareji numbarkan $10 fadlan gali pinka");
            int pinka = input.nextInt();
            if(pinka==pin) {

                System.out.println("waxaad $10 udirtay numbarkan haraagagu waa " + (Evc - 10));
            }else
                System.out.println("pinka waa qalad");
        }else
            System.out.println("qabka aad is ticmashay waa qalad isticmaal *712*numbarka*$#");


    }
}