import java.util.Arrays;

public class tekraredenCiftSayilar {
    public static void main(String[] args) {

        int[] array = {2, 335, 355, 546, 65, 56, 565, 5165, 525, 25 , 52, 515, 15, 2959, 8, 82, 82, 2, 88, 8};
        Arrays.sort(array);
        System.out.println("Dizi: " + Arrays.toString(array));

        System.out.print("Tekrar Eden Çift Sayılar: ");
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == array[i - 1] && array[i] % 2 == 0 && array[i] != array[i + 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
