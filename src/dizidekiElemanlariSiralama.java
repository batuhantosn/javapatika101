import java.util.Arrays;
import java.util.Scanner;

public class dizidekiElemanlariSiralama {
    /*
    Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
     */
    public static void main(String[] args) {
        int n;

        Scanner imp = new Scanner(System.in);
        System.out.println("Dizinin boyutu n : ");
        n = imp.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarini giriniz : ");
        for (int i = 0; i < n; i++) {
            dizi[i] = imp.nextInt();
        }
        Arrays.sort(dizi);

        for (int i = 0; i < n; i++) {
        System.out.println(dizi[i]);
        }
    }
}
