package chapter7__Arrays;

import java.util.Scanner;

public class acountsystem {
    public static void farah() {
        Scanner input = new Scanner(System.in);
        int[] allAcounts = {12345, 112233, 121212, 619964951};
        double haraagaAcount1 = 1000;
        double haraagaAcount2 = 0.02;

        double haraagaAcount3 = 0;


        System.out.println("Fadlan dooro Acount ka");
        System.out.println("1: Salaam Somali Bank ");
        System.out.println("2: premier bank ");
        System.out.println("3: Dahabshiil Bank");


        int acounts = input.nextInt();
        switch (acounts) {
            case 1:
                System.out.println("Salaam Acount " + allAcounts[0]);
                System.out.println("1 Itus haraaga Acount ka");
                System.out.println("2 U dir acount kle lacag");
                int farahacount = input.nextInt();
                switch (farahacount) {
                    case 1:
                        System.out.println("Haraaga Salaam Somali Bank ka waa $" + haraagaAcount1);
                        break;
                    case 2:
                        System.out.println("fadlan gali acount Number");
                        int acountNumber = input.nextInt();
                        if (acountNumber == allAcounts[0]) {
                            System.out.println("diraha iyo loo diraha isku mid ma noqon karan");

                        } else if (acountNumber == allAcounts[1] || acountNumber == allAcounts[2]) {
                            System.out.println("gali lacagta ");
                            double lacag = input.nextDouble();
                            if (lacag > haraagaAcount1) {
                                System.out.println("lacagta kugu ma filna");
                                break;
                            } else
                                System.out.println("waxaa acount number " + acountNumber + " udirtay $" + lacag + " haraagagu waa " + (haraagaAcount1 - lacag));

                            System.out.println("1: itus haraga Salaam Somali Bank ");
                            System.out.println("2: itus haraga premier Bank ");
                            System.out.println("3: itus haraga Dahabshiil Bank ");


                            int allhara = input.nextInt();
                            switch (allhara) {

                                case 1:
                                    System.out.println("haraaga hada Salaam Bank waa $" + (haraagaAcount1 -= lacag));
                                    break;
                                case 2:
                                    System.out.println("haraaga hada premier Bank waa $" + (haraagaAcount2 += lacag));
                                    break;
                                case 3:
                                    System.out.println("haraaga hada Dahabshiil Bank waa $" + (haraagaAcount3 += lacag));
                            }

                        } else
                            System.out.println("Acount numberka mahan mid jira");

                }
                break;

            // premier bank


            case 2:
                System.out.println("premier Bank " + allAcounts[1]);
                System.out.println("1 Itus haraaga Acount ka");
                System.out.println("2 U dir acount kle lacag");
                int Ahmedacount = input.nextInt();
                switch (Ahmedacount) {
                    case 1:
                        System.out.println("Haraaga acount ka waa $" + haraagaAcount2);
                        break;
                    case 2:
                        System.out.println("fadlan gali acount Number");
                        int acountNumber = input.nextInt();
                        if (acountNumber == allAcounts[1]) {
                            System.out.println("diraha iyo loo diraha isku mid ma noqon karan");

                        } else if (acountNumber == allAcounts[0] || acountNumber == allAcounts[2]) {
                            System.out.println("gali lacagta ");
                            double lacag = input.nextDouble();
                            if (lacag > haraagaAcount2) {
                                System.out.println("lacagta kugu ma filna");
                                break;
                            } else
                                System.out.println("waxaa acount number " + acountNumber + " udirtay $" + lacag + " haraagagu waa " + (haraagaAcount2 - lacag));
                            System.out.println("1: itus haraga Salaam Somali Bank ");
                            System.out.println("2: itus haraga premier Bank ");
                            System.out.println("3: itus haraga Dahabshiil Bank ");


                            int allhara = input.nextInt();
                            switch (allhara) {

                                case 1:
                                    System.out.println("haraaga hada Salaam Somali Bank waa $" + (haraagaAcount1 += lacag));
                                    break;
                                case 2:
                                    System.out.println("haraaga hada premier Bank waa $" + (haraagaAcount2 -= lacag));
                                    break;
                                case 3:
                                    System.out.println("haraaga hada dahabshiil Bank waa $" + (haraagaAcount3 += lacag));
                            }


                        } else
                            System.out.println("Acount numberka mahan mid jira");

                }
                break;
            //////////// Dahabsiil Bank ///////////////////////
            case 3:
                System.out.println("Dahabsiil Bank " + allAcounts[2]);
                System.out.println("1 Itus haraaga Acount ka");
                System.out.println("2 U dir acount kle lacag");
                int zakiacount = input.nextInt();
                switch (zakiacount) {
                    case 1:
                        System.out.println("Haraaga acount ka waa $" + haraagaAcount3);
                        break;
                    case 2:
                        System.out.println("fadlan gali acount Number");
                        int acountNumber = input.nextInt();
                        if (acountNumber == allAcounts[2]) {
                            System.out.println("diraha iyo loo diraha isku mid ma noqon karan");

                        } else if (acountNumber == allAcounts[0] || acountNumber == allAcounts[1]) {
                            System.out.println("gali lacagta ");
                            double lacag = input.nextDouble();
                            if (lacag > haraagaAcount3) {
                                System.out.println("lacagta kugu ma filna");
                                break;
                            } else
                                System.out.println("waxaa acount number " + acountNumber + " udirtay $" + lacag + " haraagagu waa " + (haraagaAcount3 - lacag));
                            System.out.println("1: itus haraga  Salaam Somali Bank ");
                            System.out.println("2: itus haraga premier Bank ");
                            System.out.println("3: itus haraga Dahabshiil Bank ");


                            int allhara = input.nextInt();
                            switch (allhara) {

                                case 1:
                                    System.out.println("haraaga hada Salaam Somali Bank waa $" + (haraagaAcount1 += lacag));
                                    break;
                                case 2:
                                    System.out.println("haraaga hada premier Bank waa $" + (haraagaAcount2 += lacag));
                                    break;
                                case 3:
                                    System.out.println("haraaga hada Dahabshiil Bank waa $" + (haraagaAcount3 -= lacag));
                            }

                        } else
                            System.out.println("Acount numberka mahan mid jira");

                }

        }
    }
    public static void main(String[] args) {
            farah();
    }
}