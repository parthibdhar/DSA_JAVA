import java.util.Scanner;

public class A1755 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n- i; j++) {
                    System.out.print( j + " ");
                }
                System.out.println();
            }
        }
    }
}