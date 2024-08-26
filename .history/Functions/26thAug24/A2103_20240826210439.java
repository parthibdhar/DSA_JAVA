 public class A2103 {

    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int a, int b) {
        // Ensure both numbers are positive
        a = Math.abs(a);
        b = Math.abs(b);

        // Implementing Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        // Example usage
        int num1 = 56;
        int num2 = 98;
        int gcd = calculateGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}

