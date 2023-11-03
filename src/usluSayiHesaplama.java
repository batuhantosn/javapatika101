import java.util.Scanner;

public class usluSayiHesaplama {
    /*
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
     */
    public static void main(String[] args) {
        int a, b, sonuc = 1;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        a = inp.nextInt();
        System.out.println("Ustu sayi giriniz");
        b = inp.nextInt();

        for (int i = b; i > 0; i--) {
            sonuc *= a;
        }

        System.out.println(a + "*" + b + " = " + sonuc);
    }


}
