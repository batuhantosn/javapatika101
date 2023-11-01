package ortalamaHesaplama;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz : ");
        fiz = input.nextInt();

        System.out.println("Kimya notunuz : ");
        kim = input.nextInt();

        System.out.println("Turkce notunuz : ");
        tur = input.nextInt();

        System.out.println("Tarih notunuz : ");
        tar = input.nextInt();

        System.out.println("Muzik notunuz : ");
        muz = input.nextInt();

        int toplam = mat + fiz + kim + tur + tar + muz;
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : " + sonuc);
        boolean gecti = sonuc > 60;
        System.out.println("Gecti : " + gecti);
    }
}

