import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double kdvsiz , kdvOranı = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.println("KDV'siz fiyat : ");
        kdvsiz = input.nextDouble();

        double kdv = kdvsiz * kdvOranı;
        double kdvli = kdvsiz + kdv;

        System.out.println("KDV'siz fiyat : " +kdvsiz);
        System.out.println("KDV'li fiyat : " +kdvli);
        System.out.println("KDV tutarı : "+kdv);
    }
}
