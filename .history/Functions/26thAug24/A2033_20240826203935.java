
 import java.util.Scanner;

public class A2033 {

    public static int findGreatest(int a, int b) {

        if (a==b) {
            System.out.println("Both numbers are equal");
            return 0;
        } else if (a>b) {
            System.out.println(a + " is greater");
            return a;
        } else {
            System.out.println(b + " is greater");
            return b;
        }
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number: ");
            int a = sc.nextInt();

            System.out.println("Enter 2nd number: ");
            int b = sc.nextInt();

           int res = findGreatest(a, b);
         if (res  > 0) System.out.println("The greatest number is: " + res);
         else System.out.println("Both numbers are equal");
            
        }
    }
}
