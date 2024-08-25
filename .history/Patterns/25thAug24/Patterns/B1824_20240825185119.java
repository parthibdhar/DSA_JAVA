
import java.util.Scanner;
public class B1824 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            // 1st loop
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                for (int j = 1; j <= n-i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= n-i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }


            // 2nd loop
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(" *");
                }
                for (int j = 1; j <= 2*(n-i); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
        }
    
}
