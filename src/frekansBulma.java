import java.util.Arrays;

public class frekansBulma {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequencies = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            //Bu eleman işlendiği için atla.
            if (frequencies[i] == -1) {
                continue;
            }

            int element = arr[i];
            int frequency = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == element) {
                    frequency++;
                    frequencies[j] = -1;
                }
            }

            frequencies[i] = frequency;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < arr.length; i++) {
            if (frequencies[i] != -1) {
                System.out.println(arr[i] + " sayısı " + frequencies[i] + " kez tekrarlandı. ");
            }
        }
    }
}
