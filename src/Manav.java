import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double kiloArmut,kiloElma,kiloDomates,kiloMuz,kiloPatlican;
        double fiyatArmut = 2.14, fiyatElma = 3.67, fiyatDomates = 1.11, fiyatMuz = 0.95, fiyatPatlican = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        kiloArmut = input.nextDouble();

        System.out.println("Elma Kaç Kilo ? :");
        kiloElma = input.nextDouble();

        System.out.println("Domate Kaç Kilo ? :");
        kiloDomates = input.nextDouble();

        System.out.println("Muz Kaç Kilo ? :");
        kiloMuz = input.nextDouble();

        System.out.println("Patlican Kaç Kilo ? :");
        kiloPatlican = input.nextDouble();

        double toplam = (kiloArmut*fiyatArmut)+(kiloElma*fiyatElma)+(kiloDomates*fiyatDomates)+(kiloMuz*fiyatMuz)+(kiloPatlican*fiyatPatlican);

        System.out.println("Toplam Tutar : " + toplam);
    }
}
