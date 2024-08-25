
// n= 5
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

import java.util.Scanner;
public class B1918 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int k   = i;
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(k + " ");
                    k--;
                }
                for (int j = 1; j < i; j++) {
                     k = i;
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        }
    }
}

