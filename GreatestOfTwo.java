public class GreatestOfTwo {
    public static void main(String[] args) {
        // Assign values to the two numbers
        int num1 = 10;
        int num2 = 20;

        // Use if-else to find the greatest number
        if (num1 > num2) {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
