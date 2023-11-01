import java.util.Scanner;

public class daireAlanVeCevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarı capini giriniz : ");
        r= input.nextInt();

        double alan = pi*r*r;
        double cevre = 2*pi*r;

        System.out.println("Daire alani : " + alan);
        System.out.println("Daire cevre : " + cevre);

    }
}
