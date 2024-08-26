public class A2044 {

    // Function to calculate the circumference of a circle
    public static double calculateCircumference(double radius) {
        // Using Math.PI for the value of π
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Example usage
        double radius = 5.0; // Example radius
        double circumference = calculateCircumference(radius);

        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
    }
}
