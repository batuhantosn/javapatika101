import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int sayi, toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi giriniz : ");
        sayi = inp.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi && sayi != 0) {
            System.out.println("Bu sayi mukemmel sayidir.");
        } else
            System.out.println("Bu sayi mukemmel sayi degildir.");
    }
}
