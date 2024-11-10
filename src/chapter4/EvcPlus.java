package chapter4;
import java.awt.*;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

public class EvcPlus {
    public static void main(String[] args) {
        System.out.println("Enter Dial Up");
        Scanner input=new Scanner(System.in);
        String Dial1="*770#";
        String Dial2="*711#";

        double lacg=3000;
        int Pin_code=1001;
        String Dail_Up=input.next();
        //// If ta ugu weyn  Ee gudaha Evcplus lagu soo galo
        if(Dail_Up.equals(Dial1)) {
            System.out.println("-EVCPLUS-\nFadlan geli PIN-kaaga(Enter pin)");
            int PIN = input.nextInt();

            ///if ta kaa hubineysa number sirta Evc plus
            if (Pin_code == PIN) {
                System.out.println("EVCPlus\n1.Itus haraagaaga\n2.Kaarka hadalka\n3.Bixi biil\n4.U wareeji EVCPlus\n5.Warbixin kooban" +
                        "\n6.Salaam Bank\n7.Maareynta\n8.Taaj\n9.Bill Payment");
                

                //// Switch ta ugu weyn Ee haaysaa
                //1.Itus haraagaaga\n2.Kaarka hadalka\n3.Bixi biil\n4.U wareeji EVCPlus\n5.Warbixin kooban" +
                //                        "\n6.Salaam Bank\n7.Maareynta\n8.Taaj\n9.Bill Payment");

                int Soogali = input.nextInt();
                switch (Soogali) {
                    case 1:
                        System.out.println("[-EVCPlus-] Haraagaagu waa $" + lacg); ///Waa itus haraagaaga

                        break;
                    case 2: /// waa isoo daadi 2 oo kaarka hadalka kuwa ku hoos jira
                        System.out.println("Kaarka hadalka\n1.Ku Shubo Airtime\n2.Ugu Shub Airtime" +
                                "\n3.MIFI packages\n4.Ku shubo internet\n5.Ugu shub qof kale(MMT) ");

                        /// Switch kaan waxa uu hoos imaadaa case 2 waayo waxaa la rabaa in laga sii doorto kaarka hadala waxyabaha hoos imanaya
                        //sida 1.Ku Shubo Airtime, 2.Ugu Shub Airtime. 3.MIFI packages iwm
                        //Switch kaan waxa uu suurta gelinaa in mid walba gudaha loogu dhaadhaco

                        int kun = input.nextInt();
                        switch (kun) {


                            case 1:///1.Ku Shubo Airtime

                                System.out.println("Fadlan geli Mobile-ka");
                                int Phone = input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                double lacag_Kalabixid = input.nextDouble();

                                System.out.println("Ma Hubtaa inaa $" + lacag_Kalabixid + "ugu shubeysid");
                                System.out.println("1.Haa\n2.Maya");
                                int Hubin = input.nextInt();
                                if (lacg >= lacag_Kalabixid && Hubin == 1) {
                                    System.out.println(lacag_Kalabixid + "$ ayaad ku shubtay " + Phone +
                                            "\nHaraagaga Hada waa " + (lacg - lacag_Kalabixid));
                                } else {
                                    System.out.println("Kuguma filna");
                                }
                                break;

                            case 2://2.Ugu Shub Airtime.

                                System.out.println("Fadlan geli Mobile-ka");
                                int Phone2 = input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                double lacag1_Kalabixid = input.nextDouble();
                                System.out.println("Ma Hubtaa inaa $" + lacag1_Kalabixid + "ugu shubeysid");
                                System.out.println("1.Haa\n2.Maya");
                                int Hubinn = input.nextInt();
                                if (lacg >= lacag1_Kalabixid && Hubinn == 1) {
                                    System.out.println(lacag1_Kalabixid + "$ ayaad Ugu shubtay " + Phone2 +
                                            "\nHaraagaga Hada waa " + (lacg - lacag1_Kalabixid));
                                } else {
                                    System.out.println("Kuguma filna");
                                }
                                break;
                            /// case 3 waxaa ka sii farcami doono Switch oo noo hayneysaa  sida
                            ///sida 1.Isbuucle (Weely 2.Maalinle(Daily) 3.Bille(MiFi
                            //
                            case 3:

                                System.out.println("EVCplus\n1.ku shubo Data_da MIFI");
                                int door = input.nextInt();
                                //case 3 switch kaan ayaa ugu weyn

                                switch (door) {

                                    case 1:
                                        System.out.println("EVCPlus\n1.Ku shubo Data-da MIFI ");

                                        int hoose=input.nextInt();
                                        switch (hoose){
                                            case 1:
                                                System.out.println("--Intenet BundleRecharge--");
                                                System.out.println("1.Isbuucle (Weely)\n2.Maalinle(Daily)\n3.Bille(MiFi");
                                                int moha= input.nextInt();
                                                switch (moha) {


                                                    ///// 1.Isbuucle (Weely

                                                    case 1:
                                                        System.out.println("Fadlan dooro Bundle ka\n1.$5 = 10 GB\n2.$10 = 25GB");
                                                        System.out.println("Fadlan geli number");
                                                        int phone3 = input.nextInt();
                                                        System.out.println("Fadlan geli lacg");
                                                        double Money = input.nextDouble();
                                                        if (Money == 5) {
                                                            System.out.println("Waxaad ku shubatay $" + Money + " 10 GB");
                                                        } else if (Money == 10) {

                                                            System.out.println("Waxaad ku shubatay $" + Money + " 25 GB");
                                                        } else {
                                                            System.out.println("Waaad ku  shubatay GB");
                                                        }


                                                        break;


                                                    //2.Maalinle(Daily)
                                                    case 2:


                                                        System.out.println("Fadlan dooro Bundle ka\n1.$5 = 10 GB\n2.$10 = 25GB");
                                                        System.out.println("Fadlan geli number");
                                                        int phone4 = input.nextInt();
                                                        System.out.println("Fadlan geli lacg");
                                                        double Money2 = input.nextDouble();
                                                        if (Money2 == 5) {
                                                            System.out.println("Waxaad ku shubatay $" + Money2 + " 10 GB");
                                                        } else if (Money2 == 10) {

                                                            System.out.println("Waxaad ku shubatay $" + Money2 + " 25 GB");
                                                        } else {
                                                            System.out.println("Waaad ku  shubatay "+Money2+" GB");

                                                        }
                                                        break;

                                                    // 3.Bille(MiFi)

                                                    case 3:
                                                        System.out.println("Fadlan dooro Bundle ka\n1.$20 = 40 GB\n2.$40 = 85GB\n3.$60 = 150 GB\n4.$30 = Monthly Unlimit");
                                                        int user = input.nextInt();
                                                        if (user == 1) {
                                                            System.out.println("Fadlan geli MIFI user");
                                                            String Mifi=input.next();
                                                            System.out.println("Waxaad ku shubatay 40GB");

                                                        } else if (user==2) {

                                                            System.out.println("Fadlan geli MIFI user");
                                                            String Mifi1=input.next();
                                                            System.out.println("Waxaad ku shubatay 85GB");
                                                        } else if (user==3) {
                                                            System.out.println("Fadlan geli MIFI user");
                                                            String Mif2=input.next();
                                                            System.out.println("Waxaad ku shubatay 150GB");

                                                        } else if (user==4) {
                                                            System.out.println("Fadlan geli MIFI user");
                                                            String Mif3=input.next();

                                                            System.out.println("Waxaad ku shubatay Monthly Unlimit");

                                                        }

                                                }
                                        }
                                }
                                break;

                            ///4.Ku shubo internet   wali kaarka ayaanku jirnaa
                            case 4:


                                System.out.println("Fadlan dooro number-ka aad ku  shubeyso");
                                System.out.println("1.Isbuucle(Weekly\n2.TIME BASED PACKAGES\n3.DATA\n4.Maalinle(Daily)\n5.Bille(MiFi)");
                                int case1= input.nextInt();
                                switch (case1) {

                                    ///1.Isbuucle(Weekly  case 1

                                    case 1:
                                        System.out.println("Fadlan geli Mobile-ka");
                                        int Phone4 = input.nextInt();
                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax + "ku shubatid");
                                        System.out.println("1.Haa\n2.Maya");
                                        int Hubiin = input.nextInt();
                                        if (lacg >= lacag_kalabax && Hubiin == 1) {
                                            System.out.println(lacag_kalabax + "$ ayaad ku shubtay " + Phone4 +
                                                    "\nHaraagaga Hada waa " + (lacg - lacag_kalabax));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");
                                        }

                                        // 2.TIME BASED PACKAGES  case 2
                                        break;
                                    case 2:

                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax1 = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax1 + "ku shubatid");

                                        System.out.println("1.Haa\n2.Maya");
                                        int Hubiinn = input.nextInt();

                                        if (lacg >= lacag_kalabax1 && Hubiinn == 1) {
                                            System.out.println(lacag_kalabax1 + "$ ayaad ku shubtay " +
                                                    "\nHaraagaga Hada waa " + (lacg - lacag_kalabax1));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");
                                        }
//                                        3.DATA case 3
                                        break;
                                    case 3:
                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax2 = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax2 + "ku shubatid");
                                        System.out.println("1.Haa\n2.Maya");
                                        int Hubiinnn = input.nextInt();
                                        if (lacg >= lacag_kalabax2 && Hubiinnn == 1) {
                                            System.out.println(lacag_kalabax2 + "$ ayaad ku shubtay " +
                                                    "\nHaraagaga Hada waa " + (lacg - lacag_kalabax2));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");
                                        }

                                        //4.Maalinle(Daily) case 4
                                        break;
                                    case 4:
                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax3 = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax3 + "ku shubatid");
                                        System.out.println("1.Haa\n2.Maya");
                                        int Hubiinnnn = input.nextInt();
                                        if (lacg >= lacag_kalabax3 && Hubiinnnn == 1) {
                                            System.out.println(lacag_kalabax3 + "$ ayaad ku shubtay " +
                                                    "\nHaraagaga Hada waa " + (lacg - lacag_kalabax3));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");

                                        }

                                        /// 5.Bille(MiFi) case 5
                                        break;
                                    case 5:
                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax4 = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax4 + "ku shubatid");
                                        System.out.println("1.Haa\n2.Maya");
                                        int Hubiinnnn1 = input.nextInt();
                                        if (lacg >= lacag_kalabax4  && Hubiinnnn1 == 1) {
                                            System.out.println(lacag_kalabax4 + "$ ayaad ku shubtay " +
                                                    "\nHaraagaga Hada waa " + (lacg - lacag_kalabax4));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");

                                        }

                                }
                                //  }
                                break;
                            case 5:
                                System.out.println("Fadlan Geli Mobile-ka");
                                int phone5= input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                double lacag_kalabax5 = input.nextDouble();
                                System.out.println("Ma Hubtaa inaa $" + lacag_kalabax5 + "ku shubatid");
                                System.out.println("1.Haa\n2.Maya");
                                int Hubiinnnn2 = input.nextInt();
                                if (lacg >= lacag_kalabax5  && Hubiinnnn2== 1) {
                                    System.out.println(lacag_kalabax5 + "$ ayaad ugu  shubtay " +phone5+
                                            "\nHaraagaga Hada waa " + (lacg - lacag_kalabax5));
                                } else {
                                    System.out.println(" Haraagaagu Kuguma filna");

                                }
                        }
                        break;



                    /////3.Bixi biil


                    case 3:
                        System.out.println("Bixi bill\n1.Post Paid\n2.Ku Iibso");//// swich ween
                        int hello = input.nextInt();
                        switch (hello) {
                            //1.Post Paid case 1

                            case 1:
                                System.out.println("Post Paid\n1.Ogow biilka\n2.Bixi Bixi Biil\n3.Ka Bixi Bill");
                                int haa=input.nextInt();
                                switch (haa){

                                    ///.Bixi Bixi Biil

                                    case 2:
                                        System.out.println("Fadlan geli lacgta ");
                                        double kash= input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad bixisid bill lacgtiisu tahay: $" + kash );
                                        System.out.println("1.Haa\n2.Maya");
                                        int hubiii= input.nextInt();
                                        if (hubiii==1) {
                                            System.out.println("Waxaad kala baxday bill dhan $" + kash);
                                            System.out.println("Haraagagu waa $" + (lacg - kash));


                                        }

                                        ////3.Ka Bixi Bill
                                        break;

                                    case 3:
                                        System.out.println("Fadlan Mobile-ka Geli");
                                        int phone6= input.nextInt();
                                        System.out.println("Fadlan geli lacgta ");
                                        double kash1= input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad ka bixisid bill lacgteedu  tahay: $" + kash1 );
                                        System.out.println("1.Haa\n2.Maya");
                                        int hubiiin= input.nextInt();
                                        if (hubiiin==1) {
                                            System.out.println("Waxaad ka bixisay bill dhan $" + kash1);
                                            System.out.println("Haraagagu waa $" + (lacg - kash1));


                                        }

                                }
                                break;

                            ///2.Ku Iibso   waxa uu ka farcamaa Bixi billka


                            case 2:
                                System.out.println("Fadlan Geli aqoonsiga ganaacsigada");
                                String ganac = input.next();
                                System.out.println("Waad ku guuleysatay");
                        }///siwch kale oo doorasho
                        break;



                    ////4.U wareeji EVCPlus


                    case 4:
                        System.out.println("Fadla Geli Mobile_ka");
                        int phpone = input.nextInt();
                        System.out.println();
                        System.out.println("Soo gali Lacagta");
                        double mon = input.nextDouble();
                        System.out.println("Waxaad lacag ku wareejisay Numberka " + phpone + " $" + mon +
                                "\nHaraagaagu waa $" + (lacg - mon));
                        break;



                    //5.warbixin Kooban


                    case 5:
                        System.out.println("Warbixin Kooban\n1.Last Action\n2.Wareejinta U dambeysay\n3.Iibsashadii U dambeysay" +
                                "\n4.Last 3 Action\n5.Email Me My ACtivity");// switch kle ku hoos jira

                        int action= input.nextInt();
                        switch (action){
                            case 1:
                                System.out.println("$120 ayaad u warejisay Numbarkan 619964951");
                                break;
                            case 2:
                                System.out.println("Statments\n 1. Udirtay \n 2.Kaheshay");
                                int warejin = input.nextInt();
                                switch (warejin){
                                    case 1:
                                        System.out.println("fadlan gali mobilka ");
                                        int mobile = input.nextInt();
                                        System.out.println("operation succeeded\n No Transction to Display");
                                        break;
                                    case 2:
                                        System.out.println("Fadlan gali mobile ka");
                                        int mobie2 = input.nextInt();
                                        System.out.println("operation succeeded\n No Transction to Display");
                                }
                                break;
                            case 3:
                                System.out.println("Fadlan gali Aqonsiga ganacsiga");
                                int aqonsi_ganacsi = input.nextInt();
                                System.out.println("you mini statments has been send as sms to your regestared mobile No");
                                break;
                            case 4:
                                System.out.println("you mini statments has been send as sms to your regestared mobile No");
                                break;

                        }
                        break;


                    ///6.  Salaam Bank

                    case 6:
                        System.out.println("Salaam Bank ");
                        System.out.println("1.Itus Haraaga\n2.Lacag dhigasho\n3.Lacag qaadasho\n4.Ka wareeji EvcPlus" +
                                "\n5.Ka Wareeji Account-kaaga\n6.Hubi wareejin Accout\n7.maareynta Bankiga\n8.Kala Bax");//switch kle ku hoos jira
                        int cade = input.nextInt();

                        int lac = 1000;

                        int Number_sir = 123456;

                        ////
                        switch (cade) {


                            /////1.Itus Haraaga  case 1
                            case 1:
                                System.out.println("Fadlan Geli Number kaaga sirta Ee Bankiga");


                                int Hubinn = input.nextInt();
                                if (Hubinn == Number_sir) {
                                    System.out.println("Haraagaagu Bankiga waa $" + lac + " USD");
                                } else {
                                    System.out.println(" PIN-kaaga Bankiga waa Khalad");
                                }
                            case 2:
                                System.out.println("Fadlan Geli lacagta");
                                double in = input.nextInt();
                                System.out.println(" Waxaad dhigatay bankiga lacg dhan $" + in + " Haraagaagu bankiga waa " + (in + lac + " USD"));
                                break;
                            case 3:
                                System.out.println("Fadlan Geli lacagta");

                                double inn = input.nextInt();
                                System.out.println("Fadlan Geli Macluumd");
                                String mmmm = input.next();
                                System.out.println("Fadlan geli Numberkaaga Sirta ee bankiga");
                                int jj = input.nextInt();
                                if (jj == Number_sir) {
                                    if (inn <= lac) {
                                        System.out.println("Waxaad kala baxday lacg dhan $" + inn);
                                        System.out.println("Haraagaagu Bankiga waa $" + (lac - inn) + " USD");
                                    } else {
                                        System.out.println("Kuguma filna");
                                    }

                                } else
                                    System.out.println("waa khalad");
                                break;
                            case 4:
                                System.out.println("Fadlan dooro xisaabta bankiga\n1.Salaam Sch\n2.SALAAM SOMALI BANK" +
                                        "\n3.Darasalaam Bank\4.Bank Beeraha");
                                int doorasho = input.nextInt();
                                switch (doorasho) {
                                    case 1:
                                        System.out.println("Fadlan geli Account-ka");
                                        int account1 = input.nextInt();
                                        System.out.println("Fadlan geli macluumaadka");
                                        String mac1 = input.next();
                                        System.out.println("Fadlan geli lacgta");
                                        double lacg4 = input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad kasoo wareejisid Evcplus: $" + lacg4);
                                        System.out.println("1.Haa\n2.Maya");
                                        int hubb = input.nextInt();
                                        if (hubb == 1) {
                                            System.out.println("Waxaad soo wareejisay lacag  dhan $" + lacg4);
                                            System.out.println("Haraagagu  bankigu waa $" + (lac + lacg4));


                                        }
                                        break;

                                    case 2:
                                        System.out.println("Fadlan geli Account-ka");
                                        int account = input.nextInt();
                                        System.out.println("Fadlan geli macluumaadka");
                                        String mac = input.next();
                                        System.out.println("Fadlan geli lacgta");
                                        double lacg3 = input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad kasoo wareejisid Evcplus: $" + lacg3);
                                        System.out.println("1.Haa\n2.Maya");
                                        int hub = input.nextInt();
                                        if (hub == 1) {
                                            System.out.println("Waxaad soo wareejisay lacag  dhan $" + lacg3);
                                            System.out.println("Haraagagu  bankigu waa $" + (lac + lacg3));


                                        }
                                        break;
                                    case 3:
                                        System.out.println("Fadlan geli Account-ka");
                                        int account2 = input.nextInt();
                                        System.out.println("Fadlan geli macluumaadka");
                                        String mac2 = input.next();
                                        System.out.println("Fadlan geli lacgta");
                                        double lacg6 = input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad kasoo wareejisid Evcplus: $" + lacg6);
                                        System.out.println("1.Haa\n2.Maya");
                                        int hub2 = input.nextInt();
                                        if (hub2 == 1) {
                                            System.out.println("Waxaad soo wareejisay lacag  dhan $" + lacg6);
                                            System.out.println("Haraagagu  bankigu waa $" + (lac + lacg6));


                                        }


                                }
                                break;
                            case 5:
                                System.out.println("Fadlan geli Account-ka Ama Mobile ");
                                int phones = input.nextInt();

                                System.out.println("Fadlan geli macluumaadka");
                                String mac3 = input.next();
                                System.out.println("Fadlan geli lacgta");
                                double lacg7 = input.nextDouble();
                                System.out.println("Fadlan gelin Number_siredka Account-ka ");
                                int user = input.nextInt();
                                if (user == Number_sir) {


                                    System.out.println("Ma Hubtaa inaa aad kasoo wareejisid Account-ka: $" + lacg7);
                                    System.out.println("1.Haa\n2.Maya");
                                    int hub8 = input.nextInt();
                                    if (hub8 == 1) {
                                        System.out.println("Waxaad soo wareejisay lacag  dhan $" + lacg7);
                                        System.out.println("Haraagagu  Evcplus waa $" + (lacg + lacg7));


                                    }
                                }else
                                    System.out.println("Waa khalad Number-ka sirta");
                                break;
                            case 6:
                                System.out.println("Fadlan geli OTP");
                                String OTP= input.next();
                                System.out.println("Waad ku guuleysaty OTP");
                                break;
                            case 7:
                                System.out.println("Maareynta Bankiga \n1.Bedel PIN-ka Bankiga\n2.Bedel Passwordka Ebank");
                                int Maareynta= input.nextInt();
                                switch (Maareynta){
                                    case 1:
                                        System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                        int sir= input.nextInt();
                                        if (sir==Number_sir){
                                            System.out.println("Fadlan geli PIN-ka cusub ee bankiga");
                                            int Sir_cusb= input.nextInt();
                                            System.out.println("Waa laguu bedelay PIN_ka Bankiga");
                                        }else
                                            System.out.println("Waa khalad");
                                    case 2:
                                        System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                        int sir1= input.nextInt();
                                        if (sir1==Number_sir){
                                            System.out.println("Fadlan geli PIN-ka cusub ee Ebankiga");
                                            int Sir_cusb1= input.nextInt();
                                            System.out.println("Waa laguu bedelay PIN_ka EBankiga");
                                        }else
                                            System.out.println("Waa khalad");
                                }
                                break;
                            case 8:
                                System.out.println("Fadlan geli Aqqonsiga codsiga");
                                String codsi= input.next();
                                System.out.println("Mahadsanid!");


                        }

                        break;
                    case 7:
                        System.out.println("Maareynta \n1.Bedel lambarka sirta ah\n2.Bedel Luqadad\n3.Wargelin Mobile lumay.\n4.Lacag xirasho\n" +
                                "5.U celi lacag qaldantay\n6.EnableMobileBanking");
                        int saxib= input.nextInt();
                        switch (saxib){
                            case 1:
                                System.out.println("Fadlan Geli PIN-kaagu Cusub");
                                int bin= input.nextInt();
                                Pin_code=bin;

                                System.out.println("Waa laguu bedelay Numberka sirta");
                                break;
                            case 2:
                                System.out.println("Fadlan dooro luqada\n1.English\n2.Somali");
                                int luqad=input.nextInt();
                                switch (luqad){
                                    case 1:
                                        System.out.println("Waxaad dooratay Luqada English");
                                        break;
                                    case 2:
                                        System.out.println("Waxaad dooratay Luqada Somali");
                                }
                                break;
                            case 3:
                                System.out.println("fadlan gali numbar lumay");
                                int lumay = input.nextInt();
//                                System.out.println("fadlan gali pinka numbarka lumay");
////                                int pin_lumay = input.nextInt();
                                System.out.println("mahubta ina numbarkan "+lumay+" loo diwan galiyo lumid ");
                                System.out.println("1 Haa");
                                System.out.println("2 Maya");
                                int num_lumay =input.nextInt();
                                if(num_lumay == 1){
                                    System.out.println("waad ku gulesatay ina u diwan galiso lumid "+lumay+" mahadsanid");
                                }else
                                    System.out.println("mahadsanid");
                                break;
                            case 4:
                                System.out.println("fadlan gali numbarka lagu  qalday");
                                int num_qalday = input.nextInt();
                                System.out.println("fadlan gali numbarka loo rabay");
                                int num_lorabay = input.nextInt();
                                System.out.println("fadlan gali macluumaad");
                                String macluumaad = input.next();
                                System.out.println("mahubta ina xirato lacagtan ");
                                System.out.println("1 haa");
                                System.out.println("2 maya");

                                int hubi_xirasho = input.nextInt();
                                switch (hubi_xirasho){
                                    case 1:
                                        System.out.println("waad ku gulesaty ina xirato lacagtan");
                                        break;
                                    case 2:
                                        System.out.println("mahadsanid");
                                        break;
                                }
                            case 5:
                                System.out.println("fadlan gali  lacagta");
                                int aqonsi_lacag = input.nextInt();
                                System.out.println("Fadlan geli Number-ka");
                                int mobile=input.nextInt();
                                System.out.println("fadlan gali macluumad");
                                String maclumaad = input.next();
                                System.out.println("mahubta ina lacag u celiso numbarkan ");
                                System.out.println("1 haa");
                                System.out.println("2 maya");
                                int celin = input.nextInt();
                                switch (celin){
                                    case 1:
                                        System.out.println("waad ku gulesatay ina celiso lacagta");
                                        break;
                                    case 2:
                                        System.out.println("mahadsanid");
                                        break;
                                }

                                break;
                            case 6:
                                System.out.println("fadlan gali mobile banking ");





                        }
                        break;
                    case  8:

                        System.out.println("Taaj\n1.Gudaha\n2.Dibada\n3.Ogow Khidmada\n4.Macluumaadka xawaalada\n5.Jooji Xawaalada\n6.Fur xawaalada");
                        int taaj = input.nextInt();
                        switch (taaj) {
                            case 1:
                                System.out.println("Gali Magaca qataha oo sedaxan ");
                                String macaga_qataha = input.next();
                                System.out.println("1. itus xogta keydsan\n 2. ka baar xogta keydsan\n 3. hada gali");
                                int dorosho_taaj = input.nextInt();
                                switch (dorosho_taaj) {
                                    case 1:
                                        System.out.println("wax xog ah kuma keydsano");
                                        break;
                                    case 2:
                                        System.out.println("gali magaca");
                                        int mcg = input.nextInt();
                                        System.out.println("magacan ma kedsano");
                                        break;
                                    case 3:
                                        System.out.println("gali telefonka qataha");
                                        int tel = input.nextInt();
                                        System.out.println("gali lacagta");
                                        int lcg = input.nextInt();
                                        System.out.println("Khidmadan xisabtada malaga jara \n 1. haa \n 2. maya ");
                                        int jar = input.nextInt();
                                        switch (jar) {
                                            case 1:
                                                if (lacg >= lcg) {


                                                    System.out.println("waxad khimdan u dirtay $" + lcg + "numbarkan " + tel + "haragagu waa $" + (lacg - lcg));
                                                } else
                                                    System.out.println("haraga kugu ma filna ");
                                                break;
                                            case 2:
                                                System.out.println("mahadsanid");
                                        }
                                }
                                break;
                            case 2:
                                System.out.println("1 Taaj money transefer\n 2. E-kaafi \n 3.E-sahal");
                                int taaj_dibada = input.nextInt();
                                switch (taaj_dibada){
                                    case 1:
                                System.out.println("gali magaca qataha oo sedaxan");
                                String mcg = input.next();
                                System.out.println("1. itus xogta keydsan\n 2. ka baar xogta keydsan\n 3. hada gali");
                                int dorosho_taaj1 = input.nextInt();
                                switch (dorosho_taaj1) {
                                    case 1:
                                        System.out.println("wax xog ah kuma keydsano");
                                        break;
                                    case 2:
                                        System.out.println("gali magaca");
                                        int mcg_dibad = input.nextInt();
                                        System.out.println("magacan ma kedsano");
                                        break;
                                    case 3:
                                        System.out.println("gali telefonka qataha");
                                        int tel_dibad = input.nextInt();
                                        System.out.println("gali lacagta");
                                        int lcg_dibad = input.nextInt();
                                        System.out.println("Khidmadan xisabtada malaga jara \n 1. haa \n 2. maya ");
                                        int jar_dibad = input.nextInt();
                                        switch (jar_dibad) {
                                            case 1:
                                                if (lacg >= lcg_dibad) {


                                                    System.out.println("waxad khimdan u dirtay $" + lcg_dibad + "numbarkan " + tel_dibad + "haragagu waa $" + (lacg - lcg_dibad));
                                                } else
                                                    System.out.println("haraga kugu ma filna ");
                                                break;
                                            case 2:
                                                System.out.println("mahadsanid");
                                        }
                                        break;
                                }
                                break;
                                    case 2:
                                       break;
                                    case 3:

                                }
                        }
                        break;
                    case 9:
                        System.out.println("EVCPlus \n1.Itus haraagaaga biil ka\n2.Wada bixi Bill-ka\n3.Qaybka bixi Bill-ka");


                }//// Switch ugu weyn  projectigena Soogeli ku qorantahay

            }else
                System.out.println("PIN-kaagu waa khalad ");//Else 2aad \\\\ Password in uu khaldan yahay sheegeysa

        //    if(Dail_Up.equals(Dial1)) {


        } else if(Dail_Up.equals(Dial2)){
            System.out.println("-EVCPLUS-\nFadlan geli PIN-kaaga(Enter pin)");
            int PIN = input.nextInt();
            if (Pin_code == PIN){
                System.out.println("[-EVCPlus-] Haraagaagu waa $" + lacg); ///Waa itus haraagaaga

            }else {
                System.out.println("PIN-kaagu waa khalad ");//Else 2aad \\\\ Password in uu khaldan yahay sheegeysa

            }

        }

        else
            System.out.println("Waxaad Ku soo gali gartaa *770#");///Else Weynta waa

    }//// main methodka
}/////class guud ee projectigeena
