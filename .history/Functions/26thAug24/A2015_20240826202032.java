import java.util.Scanner;

public class A2015 {

    public static int average(int a, int b, int c) {

        int avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number: ");
            int a = sc.nextInt();

            System.out.println("Enter 2nd number: ");
            int b = sc.nextInt();

            System.out.println("Enter 3rd number: ");
            int c = sc.nextInt();

            
            int avg = average(a, b, c);
            System.out.println(avg);
        }
    }
}