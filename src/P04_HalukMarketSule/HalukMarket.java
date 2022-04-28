package P04_HalukMarketSule;

import java.util.Locale;
import java.util.Scanner;

public class HalukMarket extends Methods{
    public static void main(String[] args) {
        String no[] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10"};
        String urun[] = {"Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"};
        String fiyat[] = {"2.10 TL", "3.20 TL", "1.50TL", "2.30TL", "3.10TL", "1.20 TL", "1.90 TL", "6.10 TL", "4.30 TL", "2.70 TL", "0.50 TL"};

        System.out.println("No       Urun        Fiyat");
        System.out.println("====    =======     =========");

        for (int i = 0; i < urun.length; i++) {
            System.out.printf("%-7s %-11s %5s\n", no[i], urun[i], fiyat[i]);
            //
        }


        secimYapMethodu();
    }


    }

