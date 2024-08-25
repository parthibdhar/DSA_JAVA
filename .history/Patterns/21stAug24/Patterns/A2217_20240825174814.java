import java.util.Scanner;

//  inverted half pyramid 


public class A2217 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number in inverted half pyramid : ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n-i; j++) {  
                    System.out.print("   ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
