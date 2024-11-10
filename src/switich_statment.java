import java.util.Scanner;

public class switich_statment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mounth");
        int mounth = input.nextInt();
        switch (mounth){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("fan");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("junly");
                break;
            case 8:
                System.out.println("augs");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("act");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("ma ba jirtee");

        }

    }
}
