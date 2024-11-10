import java.util.Scanner;

public class Evc__plus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dial = "*770#";

        double haraaga = 100;
        int Pin = 1001;
        System.out.println("dial");
        String dialip=input.next();
        if(dialip.equals(dial)){
            System.out.println("Evc Plus");
            System.out.println("Fadlan gali pinka ");
            int pinka =input.nextInt();
            if(pinka==Pin){
                System.out.println("1. itus haragaga");
                System.out.println("2. kaarka hadalka");
                System.out.println("3. Bixi bill");
                System.out.println("4. U waraji Evc plus");
                System.out.println("5. Warbixin kooban");
                System.out.println("6. Salaam bank");
                System.out.println("7. Maareynta");
                System.out.println("8. Bill payment");
                System.out.println("9 Taaj");
                int itus_haraga = input.nextInt();
                switch (itus_haraga) {
                    case 1:
                        System.out.println("haraagagu waa $" + haraaga);
                        break;
                    case 2:
                        System.out.println("Kaarka ku hadalka");
                        System.out.println("1 Ku shubo Air time");
                        System.out.println("2 Ugu shub air time");
                        System.out.println("3 mifi Pacges");
                        System.out.println("4 Ku shubo internet");
                        System.out.println("5 ugu shub qof le MMT");

                        int ku_hadal =input.nextInt();
                        switch (ku_hadal){
                            case 1:
                                System.out.println("fadlan gali lacagta ");
                                int mon1 =input.nextInt();
                                System.out.println("ma hubta ina lacag $"+mon1+" iskugu shubtid");
                                System.out.println("1 haa");
                                System.out.println("2 maya");
                                int hubin1=input.nextInt();
                                if(haraaga>=mon1){
                                    if(hubin1 ==1)
                                        System.out.println("waxad ku shubatay $"+mon1+" haragagu waa "+(haraaga-mon1));
                                    else
                                    System.out.println("mahadsanid");

                                }else
                                    System.out.println("haraaga kugu ma filna");
                                break;
                            case 2:
                                System.out.println("fadlan gali numbarka");
                                int num2= input.nextInt();
                                System.out.println("gali lacagta");
                                int mon2=input.nextInt();
                                System.out.println("ma hubta ina ugu shubtid $"+mon2+" numbarkan "+num2);
                                System.out.println("1 haa");
                                System.out.println("2 maya");
                                int doorasho2=input.nextInt();
                                if(haraaga>=mon2){
                                    if(doorasho2 == 1)
                                        System.out.println("waxad ugu shubtay $"+mon2+" numbarkan"+num2+"haragagu waa"+(haraaga-mon2));
                                    else
                                        System.out.println("mahadsanid");
                                }else
                                    System.out.println("haraaga kugu ma filna");
                                break;
                            case 3:
                                System.out.println("mifi pacages");
                                System.out.println("1 ku shubo data mifi");
                                int doorasho3=input.nextInt();
                                if(doorasho3 ==1){
                                    System.out.println("Internet Bundle recherge");
                                    System.out.println("1 isbuucle (weekley)");
                                    System.out.println("2 Maalinle (daily)");
                                    System.out.println("3 Bile (mifi)");
                                    int Bundule=input.nextInt();
                                    switch (Bundule){
                                        case 1:
                                            System.out.println("fadlan dooro bundulka");
                                            System.out.println("1 $5 = 10GB");
                                            System.out.println("2 $10 = 25GB");
                                            int doorasho4 =input.nextInt();
                                            if(doorasho4 == 1) {
                                                System.out.println("fadlan gali Mifi user");
                                                int mifi = input.nextInt();
                                                System.out.println("mahubta ina 5$ "+mifi+"uga shubatid ");
                                                System.out.println("1 haa");
                                                System.out.println("2 maya");
                                                int mife =input.nextInt();
                                                if(mife ==1) {
                                                    if (haraaga >= 5) {


                                                        System.out.println("waxaad 5$ ugu shubtay " + mifi + "haraagagu " + (haraaga - 5));

                                                    } else
                                                        System.out.println("Haraaga kugu ma filna");
                                                }else
                                                    System.out.println("mahadsanid");
                                            }else
                                               // System.out.println("mahadsanid");
                                                if (doorasho4 == 2){
                                                    System.out.println("fadlan gali Mifi user");
                                                    int mifi = input.nextInt();
                                                    System.out.println("mahubta ina 10$ "+mifi+" uga shubatid ");
                                                    System.out.println("1 haa");
                                                    System.out.println("2 maya");
                                                int mifi1 = input.nextInt();
                                                    if(mifi1 ==1){
                                                        if (haraaga >= 10) {

                                                            System.out.println("waxaad 10$ ugu shubtay " + mifi + " haraagagu " + (haraaga - 10));
                                                        }else
                                                            System.out.println("haraaga kugu ma filna");
                                                    }else
                                                        System.out.println("mahadsanid");



                                            }else
                                                System.out.println("mahadsanid");
                                                break;
                                        case 2:
                                            System.out.println("fadlan dooro bundulka");
                                            System.out.println("1 $1 = 1GB");
                                            System.out.println("2 $2 = 2GB");
                                            break;
                                        case 3:
                                            System.out.println("fadlan dooro bundulka");
                                            System.out.println("1 $20 = unlimited");
                                    }

                                }else
                                    System.out.println("fadlan doro numbarka saxda");




                        }

                        break;
                    case 3:
                        System.out.println("Bixi bill");
                        System.out.println("1 post paid");
                        System.out.println("2 Ku iibso");
                        break;

                    case 4:
                        System.out.println("Fadlan gali numbarka");
                        int num = input.nextInt();
                        System.out.println("fadlan gali lacagta");
                        double mon = input.nextDouble();
                        System.out.println("mahubta ina lacag dhan $" + mon + " Udireso Numbarkan " + num);
                        System.out.println("1 Haa");
                        System.out.println("2 Maya");
                    int hubin = input.nextInt();
                    if (haraaga >= mon) {
                        if (hubin == 1)
                            System.out.println("waxaa $" + mon + " ugu shubtay " + num + " haragagu waa $" + (haraaga - mon));
                        else
                            System.out.println("mahadsanid");
                    } else
                        System.out.println("haraagagu kugu ma filna");
                    break;
                    case 5:
                        System.out.println("Warbixin kooban");
                        System.out.println("1 Last action");
                        System.out.println("2 Warejintii u danbesay");
                        System.out.println("3 iibshashadii udanbesay");
                        System.out.println("4 Last 3 actions");
                        System.out.println("5 Email me my activity");
                        break;
                    case 6:
                        System.out.println("Salaam bank");
                        System.out.println("1 itus haraagaga Bangiga");
                        System.out.println("2 Lacag dhigasho");
                        System.out.println("3 Lacag qadasho");
                        System.out.println("4 Acount to Acount");
                        System.out.println("5 Hubi Acount to Acount");
                        System.out.println("6 Badel lamarka sirta Bangiga");
                        System.out.println("7 ka bax ");
                        int salam_bank =input.nextInt();
                        double haraaga_bangiga = 12;
                        int pin__bank = 123456;
                        switch (salam_bank){
                            case 1:
                                System.out.println("gali pinka bangiga ");
                                int pin =input.nextInt();

                                if(pin == pin__bank) {
                                    System.out.println("Haraaga waa $" + haraaga_bangiga);
                                }else
                                    System.out.println("pinka bankiga waa khalad");
                            break;
                            case 2:
                                System.out.println("gali lacgta ");
                                int lacg_dhigasho = input.nextInt();
                                System.out.println("gali macluumad");
                                String macluumaad = input.next();
                                System.out.println("fadlan gali pinka bangiga");
                                int bangi_pin = input.nextInt();
                                if(bangi_pin == pin__bank){
                                    System.out.println("waad ku guleesay ina dhigato lacag bangiga haraagagu waa "+(haraaga_bangiga+lacg_dhigasho));
                                }else
                                    System.out.println("pin aad galisay waa qalad");
                                break;
                            case 3:
                                System.out.println("gali lacagta ");
                                int lacag_qadasho = input.nextInt();
                                System.out.println("gali macluumaad");
                                String maclumad = input.next();
                                System.out.println("fadlan gali pinga bangiga ");
                                int bangi__pin = input.nextInt();
                                if(bangi__pin == pin__bank){
                                    System.out.println("waad ku guulesaty ina lacag qadado haraagagu waa $"+(haraaga_bangiga-lacag_qadasho));
                                }else
                                    System.out.println("pin aad gali waa qalad");
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;

                        }
                        break;
                    case 7:
                        System.out.println("Maareynta");
                        System.out.println("1 Badel lamarka sirta ah");
                        System.out.println("2 Badel Luqada");
                        System.out.println("3 Wargalin mobile lumay");
                        System.out.println("4 Lacag xirasho");
                        System.out.println("5 U cali lacag qaldantay");
                        System.out.println("6 Enable mobile banking");
                        int maareynta = input.nextInt();
                        switch (maareynta){
                            case 1:
                                System.out.println("fadlan gali pinka cusub ");
                                int new_pin = input.nextInt();
                                System.out.println("Hubi pinka kaga cusub");
                                int comfirm_pin =input.nextInt();
                                if(new_pin == comfirm_pin){
                                    System.out.println("waxad ku gulesatay inta badasho pin kada mahadsanid");
                                }else
                                    System.out.println("isku mid maha pinka aad soo galisay");
                                break;
                            case 2:
                                System.out.println("fadlan dooro luqada aad rabto ");
                                System.out.println("1 Somalia");
                                System.out.println("2 English");
                                int luqad = input.nextInt();
                                if(luqad == 1) {
                                    System.out.println("waad ku gulesatay ina badasho luqada ");
                                }else if(luqad == 2){
                                        System.out.println("your are succsessfullly in change of languege ");

                                }else
                                    System.out.println("mahadsanid");
                                break;
                            case 3:
                                System.out.println("fadlan gali numbar lumay");
                                int lumay = input.nextInt();
                                System.out.println("fadlan gali pinka numbarka lumay");
                                int pin_lumay = input.nextInt();
                                System.out.println("mahubta ina numbarkan "+lumay+" loo diwan galiyo lumid ");
                                System.out.println("1 haa");
                                System.out.println("2 maya");
                                int num_lumay =input.nextInt();
                                if(num_lumay == 1){
                                    System.out.println("waad ku gulesatay ina u diwan galiso lumid "+lumay+" mahadsanid");
                                }else
                                    System.out.println("mahadsanid");
                                break;
                            case 4:
                                System.out.println("fadlan gali numbarka  qalday");
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
                                System.out.println("fadlan gali aqonsiga lacagta");
                                int aqonsi_lacag = input.nextInt();
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
                            case 6:
                                System.out.println("fadlan gali mobile banking ");



                        }
                        break;
                    case 8:
                        System.out.println("Pill Payment");
                        System.out.println("1 itus haraaga bill ka");
                        System.out.println("2 wada bix bill ka");
                        System.out.println("3 Qayb ka bixi bill ka");



                }









            }else {
                System.out.println("Pinka aad galisay waa qalad");
            }






        }else {
            System.out.println("fadlan ku soo gal *770#");
        }





    }
}
