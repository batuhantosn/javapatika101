import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int a , b, select;
        double sonuc = 0;
        boolean error = false;
        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayiyi giriniz : ");
        a = input.nextInt();
        System.out.println("İkinci sayiyi giriniz : ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");

        System.out.println("Seciminizi giriniz (1-4) : ");
        select = input.nextInt();

        switch (select){
            case 1:
                sonuc = a + b;
                break;
            case 2:
                sonuc = Math.abs(a-b);
                break;
            case 3:
                sonuc = a * b;
                break;
            case 4:
                sonuc = a / b;
                break;
            default:
                error = true;
                
        }
        if (error == true){
            System.out.println("yanlis değer girdiniz");
        }else
            System.out.println("Sonuc : " + sonuc);

    }
}
