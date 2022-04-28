package P04_HalukMarketSule;

import java.util.Locale;
import java.util.Scanner;

public class HalukMarket {
    public static void main(String[] args) {
        String no[] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10"};
        String urun[] = {"Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"};
        String fiyat[] = {"2.10 TL", "3.20 TL", "1.50TL", "2.30TL", "3.10TL", "1.20 TL", "1.90 TL", "6.10 TL", "4.30 TL", "2.70 TL", "0.50 TL"};

        System.out.println("No       Urun        Fiyat");
        System.out.println("====    =======     =========");

        for (int i = 0; i < urun.length; i++) {
            System.out.printf("%-7s %-11s %5s\n", no[i], urun[i], fiyat[i]);
        }


        secimYapMethodu();
    }

    public static void secimYapMethodu() {

        System.out.println("Alışverişe devam etmek istiyorsanız E tuşuna, istemiyorsanız H tuşuna basınız.");
        Scanner scan =new Scanner(System.in);
        String secim = scan.next().substring(0,1).toUpperCase(Locale.ROOT);

        if (secim.equals("E")){
            // urunsec(urunListesi, fiyatListesi);
        }else if (secim.equals("H")){
            //  paraUstuHesaplaMethodu();
        }else {
            System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz.");
            secimYapMethodu();
        }

    }
}
