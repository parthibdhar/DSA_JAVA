
public class B1824 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 2*n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                for (int j = 1; j <= 2*n-i; j++) {
                    System.out.print("  ");
                }
            }
        }
    }
}
