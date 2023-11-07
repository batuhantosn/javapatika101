public class harmonicSayiHesaplamaDizi {
    public static void main(String[] args) {
        double[] numbers = {1,2,3};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
                sum += 1/numbers[i];
        }
        System.out.println("sum : " + sum);
        double result = numbers.length / sum;
        System.out.println("result : " + result);
    }

}
