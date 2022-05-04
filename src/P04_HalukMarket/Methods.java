package P04_HalukMarket;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Methods extends Variables {

    public static <max> double urunSec(List<String> urunListesi, List<Double> fiyatListesi) {
        System.out.println("******** HALUK MARKETE HOSGELDİNİZ **********");


        System.out.println("Lütfen almak istediginiz urunun numarasını giriniz :\n " + urunListesi);



        int secilenUrun = 0;

        while (true) {
            try {
                secilenUrun = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("lütfen rakam giriniz");
                scan.nextLine();
            }
        }



        if (secilenUrun>12){
            System.out.println("Lütfen aşağıda bulunan listeden bir ürün numarası giriniz");
            urunSec(urunListesi,fiyatListesi);
        }else if (secilenUrun<1){
            System.out.println("Lütfen aşağıda bulunan listeden bir ürün numarası giriniz");
            urunSec(urunListesi,fiyatListesi);
        }else




        System.out.println("lütfen kac kg almak istediginizi giriniz : ");
        double miktar = 0;

    while (true) {
        try {
            miktar = scan.nextInt();
            break;
        } catch (InputMismatchException e) {
            System.out.println("lütfen miktar giriniz");
            scan.nextLine();
        }
    }



        sepet.add(miktar + " kg " + (urunListesi.get(secilenUrun - 1).replaceAll("\\d", "")) + " ");
        sepetTutari += fiyatListesi.get(secilenUrun - 1) * miktar;
        System.out.println("Su an sepetteki urunler : " + sepet);
        secimYapMethodu();
        return miktar;

    }




    public static double paraUstuHesaplaMethodu(){
        System.out.println("Lütfen hesap bakiyenizi giriniz : ");
        musteriBakiye = scan.nextDouble();
        System.out.println("Hesap bakiyeniz : " + musteriBakiye + " tl ödemeniz gereken tutar :" + (double) sepetTutari + "tl");


        if (musteriBakiye >= sepetTutari) {
            System.out.println("Para üstünüz : " + (double) (musteriBakiye - sepetTutari) + "tldir \n" + " ***Yine Bekleriz***");
            return (musteriBakiye - sepetTutari);

        } else {
            System.out.println("Yetersiz Bakiye");

        }
        return 0;
    }




    public static void secimYapMethodu() {

        System.out.println("Alışverişe devam etmek istiyorsanız E tuşuna, istemiyorsanız H tuşuna basınız.");
        Scanner scan = new Scanner(System.in);
        String secim = scan.next().substring(0, 1).toUpperCase(Locale.ROOT);


        if (secim.equals("E")) {
            urunSec(urunListesi, fiyatListesi);
        } else if (secim.equals("H")) {
            paraUstuHesaplaMethodu();
        } else {
            System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz.");
            secimYapMethodu();

        }
    }

}




