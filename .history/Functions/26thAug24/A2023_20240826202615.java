import java.util.Scanner;

public class A2023 {

    public static int sumOfAllOddNumbers(int n) {

        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the last Value: ");
            int n = sc.nextInt();

        }
    }
}