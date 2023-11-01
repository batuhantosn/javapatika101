import java.util.Scanner;

public class ucgenAlanHesaplama {
    public static void main(String[] args) {
        int a,b,c; //kenarlar
        double u; //cevre
        double alan;
        Scanner ip = new Scanner(System.in);

        System.out.println("Ilk kenari giriniz : ");
        a = ip.nextInt();

        System.out.println("Ikinci kenari giriniz : ");
        b = ip.nextInt();

        System.out.println("Ucuncu kenari giriniz : ");
        c = ip.nextInt();

        u = (a+b+c)/2.0;
        System.out.println("Ucgenin cevresi : " + u);

        double alanKare = u * (u - a)* (u - b) * (u - c);
        alan = Math.sqrt(alanKare);

        System.out.println("Ucgenin alani : " + alan);
    }
}
