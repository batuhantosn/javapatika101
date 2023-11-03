import java.util.Scanner;

public class girilenSayiyaKadarUcDort {
    public static void main(String[] args) {
        int sayi, sayac = 0, toplam = 0, ortalama = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi giriniz");
        sayi = inp.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0) && i!=0) {
                sayac++;
                toplam += i;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("0 dan girilen sayiya kadar olan 3 ve 4 de tam bolunen sayilarin ortalamasi : " + ortalama);
    }
}
