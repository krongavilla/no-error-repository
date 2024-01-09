public class SimpleProgram {

    public static void main(String[] args) {
        // Example usage of sum and multiply methods
        int a = 5;
        int b = 7;

        int sumResult = sum(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sumResult);

        int multiplyResult = multiply(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + multiplyResult);
    }

    // Method to calculate the sum of two integers
    public static int sum(int x, int y) {
        return x + y;
    }

    // Method to calculate the product of two integers
    public static int multiply(int x, int y) {
        return x * y;
    }
}
