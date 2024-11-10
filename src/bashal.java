import java.util.Scanner;

public class bashal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double Evc  =100;

        System.out.println("fadlan gali Pin ka");
        int pin = input.nextInt();



        if(pin == 123){
                    System.out.println("1. itus haragaga");
                    System.out.println("2. kaarka hadalka");
                    System.out.println("3. Bixi bill");
                    System.out.println("4. U waraji Evc plus");
                    System.out.println("5. Warbixin kooban");
                    System.out.println("6. Salaam bank");
                    System.out.println("7. Maareynta");
                    System.out.println("8. Bill payment");


        }else {
            System.out.println("pin ka aad galisay waa qalad");
        }
        int option =input.nextInt();
        switch (option) {
            case 1:
                System.out.println("haraagagu waa $" + Evc);
                break;
            case 4:
                System.out.println("gali numberka");
                int num =input.nextInt();
                System.out.println("gali lacagta");
                double lacag = input.nextDouble();
                System.out.println("ma hubta ina lacag dhan $"+lacag+ " udireso numbarkan " +num);
                System.out.println("1 Haa");
                System.out.println("2 Mya");
        int yx = input.nextInt();
                System.out.println("Evc plus waxad $"+lacag+ " udirtay Numbarka "+num+ " haraagagu waa $"+(Evc-lacag));
        }







        }



    }


