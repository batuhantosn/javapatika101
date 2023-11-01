import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {
        double weight,height,index;
        Scanner input =  new Scanner(System.in);

        System.out.println("Kilonuzu giriniz : ");
        weight = input.nextDouble();

        System.out.println("Boyunuzu giriniz : ");
        height = input.nextDouble();

        index = weight / (height*height);

        System.out.println("Vucut kitle indeksi :" + index);

    }
}
