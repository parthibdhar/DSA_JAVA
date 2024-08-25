import java.util.Scanner;

public class A1759 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int k = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print( k + " ");
                    k++;
                }
                System.out.println();
            }
        }
    }
}