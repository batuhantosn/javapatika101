import java.util.Scanner;

public class recursiveMetotlarlaUstluSayi {

    public static int recursive(int a, int b){
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            int altUsSonuc = recursive(a, b / 2);
            return altUsSonuc * altUsSonuc;
        } else {
            int altUsSonuc = recursive(a, (b - 1) / 2);
            return a * altUsSonuc * altUsSonuc;
        }
    }
    public static void main(String[] args) {
        int a , b, sonuc;
        Scanner inp = new Scanner(System.in);

        System.out.println("Taban değerini giriniz : ");
        a = inp.nextInt();

        System.out.println("Üs degerinizi giriniz :");
        b = inp.nextByte();

        sonuc = recursive(a,b);

        System.out.println("Sonuc : " + sonuc);
    }
}
