package P04_HalukMarketSule;

import java.util.List;
import java.util.Scanner;

public class Methods extends Variables {
    public static void urunSec(List<String> urunListesi, List<Double>fiyatListesi){
        System.out.println("******** HALUK MARKETE HOSGELDİNİZ **********");
        System.out.println("Lütfen almak istediginiz urunun numarasını giriniz :\n " +urunListesi);
        int secilenUrun=scan.nextInt();
        System.out.println("Lütfen kac kg almak istediginizi giriniz : ");
        double miktar=scan.nextDouble();
        sepet.add(miktar+ " kg " + (urunListesi.get(secilenUrun - 1 ).replaceAll("\\d","")))+
                sepetTutari += fiyatListesi.get(secilenUrun -1)*miktar;
        System.out.println("Su an sepetteki urunler : " +sepet);
        secimYapMetodu();


    }

    private static void secimYapMetodu() {

    }


}
