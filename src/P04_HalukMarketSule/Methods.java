package P04_HalukMarketSule;
//1.05
import java.util.Locale;
import java.util.Scanner;

public class Methods extends Variables{

    public static void secimYapMethodu() {

        System.out.println("Alışverişe devam etmek istiyorsanız E tuşuna, istemiyorsanız H tuşuna basınız.");
        Scanner scan = new Scanner(System.in);
        String secim = scan.next().substring(0, 1).toUpperCase(Locale.ROOT);

        if (secim.equals("E")) {
            // urunsec(urunListesi, fiyatListesi);
        } else if (secim.equals("H")) {
            //  paraUstuHesaplaMethodu();
        } else {
            System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz.");
            secimYapMethodu();
            //
        }
    }

}
