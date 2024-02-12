package School_Project;

import java.util.Scanner;

public class Helper {
    static Scanner scan = new Scanner(System.in);

    //AŞAĞIDAKİ anaMenu() METODUNDA BİR DEĞİŞİKLİK YAPMAYINIZ!
    public static void anaMenu() throws InterruptedException {

        String tercih="";
        do{
        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "=================== ANA MENU ====================\n" +
                        "\n" +
                        "\t   1- Okul Bilgileri Goruntule\n" +
                        "\t   2- Ogretmen Menu\n" +
                        "\t   3- Ogrenci Menu\t\t \n" +
                        "\t   0- CIKIS\n");
        System.out.print("Lutfen Menuden tercihinizi yapiniz = ");

        tercih=scan.nextLine().toLowerCase();

        switch (tercih){
            case "1" :  // Okul bilgileri
                Helper.okulBilgileriniYazdir();
                break;
            case "2" :  // Ogretmen menu
                OgretmenManager.ogretmenMenu();
               break;
            case "3" :  // ogrenci menu
                OgrenciManager.ogrenciMenu();
               break;
            case "0" :Helper.projeDurdur();
                break;
            default  :
                System.out.print("Lutfen gecerli bir tercih giriniz = ");
        }


        }while(!tercih.equalsIgnoreCase("q"));


        Helper.projeDurdur();
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }


        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n");

        System.out.println("Okul : " + Okul.okulIsmi);
        System.out.println("Adres : " + Okul.adres);
        System.out.println("Telefon : " + Okul.telefon);




    }

    // AŞAĞIDAKİ projeDurdur() METODUNDA BİR DEĞİŞİKLİK YAPMAYINIZ.
    public static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz...");
        System.exit(0);
    }


}
