import java.util.Scanner;

public class garedes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter java marks");
        double java = input.nextDouble();
        System.out.println("enter C# marks");
        double c_sharp = input.nextDouble();
        System.out.println("enter Enhlish marks");
        double English  =input.nextDouble();
        double total;
        double avarage;
        total = java+c_sharp+English;
        System.out.println(total);
        avarage = total/3;


        if(avarage >= 90){
            System.out.println("A");

        }else if(avarage>= 80){
            System.out.println("B");
        }else if(avarage >= 70){
            System.out.println("C");
        }else if(avarage >= 60){
            System.out.println("D");
        }else if(avarage<=50){
            System.out.println("waa dhacday");
        }

    }
}
