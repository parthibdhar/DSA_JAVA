import java.util.Scanner;
public class B2108 {

    public static void printFibonacci(int n) {

        int fstVal = 0, scndVal = 1, nextVal = 0;
        System.out.print(fstVal + " " + scndVal + " ");
        for (int i = 2; i < n; i++) {
            nextVal = fstVal + scndVal;
            System.out.print(nextVal + " ");
            fstVal = scndVal;
            scndVal = nextVal;
        } 

    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        printFibonacci(n);
    }
}
