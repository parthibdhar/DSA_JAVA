import java.util.Scanner;

public class B1802 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=  i ; j++) {
                    System.out.print( (((i-j) + 1) % 2) + " ");
                    
                }
                System.out.println();
            }
        }
    }
}