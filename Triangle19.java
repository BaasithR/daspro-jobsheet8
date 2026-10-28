import java.util.Scanner;

public class Triangle19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i < n){
            // System.out.println("[i=" + i + "] ");   //debug sementara
            int j = 0;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        i=n;
        while (i>0) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
