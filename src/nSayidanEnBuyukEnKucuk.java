import java.util.Scanner;

public class nSayidanEnBuyukEnKucuk {
    public static void main(String[] args) {
        int kacSayi, sayi, enKucuk = 1000, enBuyuk = -1000;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kac sayi giriceksini : ");
        kacSayi = inp.nextInt();

        for (int i = 0; i < kacSayi; i++) {
            System.out.println((i + 1) + ".sayiyi giriniz : ");
            sayi = inp.nextInt();
            if (enBuyuk < sayi) {
                enBuyuk = sayi;
            }
            if (enKucuk > sayi) {
                enKucuk = sayi;
            }
        }
        System.out.println("En buyuk sayi : " + enBuyuk);
        System.out.println("En kucuk sayi : " + enKucuk);
    }
}
