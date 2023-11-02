import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat,fiz,turk,kim,muzik;
        int ortalamayaKatilicakDersSayisi = 5;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = inp.nextInt();
        if (0>mat || mat>100){
            mat = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        System.out.println("Fizik notunuz : ");
        fiz = inp.nextInt();
        if (0>fiz || fiz>100){
            fiz = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        System.out.println("Turkce notunuz : ");
        turk = inp.nextInt();
        if (0>turk || turk>100){
            turk = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        System.out.println("Kimya notunuz : ");
        kim = inp.nextInt();
        if (0>kim || kim>100){
            kim = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        System.out.println("Muzik notunuz : ");
        muzik = inp.nextInt();
        if (0>muzik || muzik>100){
            muzik = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        double avarage = (mat+fiz+turk+kim+muzik)/ortalamayaKatilicakDersSayisi;
        if (avarage<55)
            System.out.println("Sinifta kaldiniz");
        else
            System.out.println("Gectiniz");
        System.out.println("Ortalama notunuz : " + avarage);
    }
}
