import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20,total, startPrice = 10;
        Scanner input = new Scanner(System.in);
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total<15) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);
    }
}