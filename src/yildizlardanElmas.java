public class yildizlardanElmas {
    public static void main(String[] args) {

        int d=4;
        int e=1;

        for (int i = 0; i < 10; i++) {
            for (int a = 0; a <= d; a++) {
                System.out.print(" ");
            }
            for (int b = 0; b < e; b++) {
                System.out.print("*");
            }
            for (int c = 0; c <= d; c++) {
                System.out.print(" ");
            }
            System.out.println("\n");
            if (i > 3){
                d++;
                e-=2;
            }else{
                d--;
                e+=2;
            }

        }
    }
}
