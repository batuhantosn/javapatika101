import java.util.Scanner;

public class havayaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sicaklik giriniz : ");
        heat = inp.nextInt();

        if (heat<=5)
            System.out.println("Kayak");
        else if (5 < heat && heat <= 15) {
            System.out.println("Sinema");
        } else if (15 < heat && heat <=25) {
            System.out.println("Piknik");
        } else if (25<heat) {
            System.out.println("Yuzme");
        }
    }
}
