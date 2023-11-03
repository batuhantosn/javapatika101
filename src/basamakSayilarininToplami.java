import java.util.Scanner;

public class basamakSayilarininToplami {
    public static void main(String[] args) {
        int sayi, holder, numberCounter = 0;
        int sonuc = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi giriniz : ");
        sayi = inp.nextInt();
        holder = sayi;

        while (holder != 0) {
            holder /= 10;
            numberCounter++;
        }

        for (int i = 0; i < numberCounter; i++) {
            sonuc += (int) (sayi / Math.pow(10, i)) % 10;
        }

        System.out.println("Basamak sayilarinin toplami : " + sonuc);
    }
}
