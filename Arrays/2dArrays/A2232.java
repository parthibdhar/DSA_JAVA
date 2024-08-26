import java.util.Scanner;

@SuppressWarnings("resource")
public class A2232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int  cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.err.println("");
        } 

        System.out.println("Enter the number: ");
        int  x = sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == x) {
                    System.out.print("found your number at (" + i  + "," + j + "); ");
                }
            }
            System.err.println("");
        }
        
    }
}
