public class GreatestOfThree {
    public static void main(String[] args) {
        // Assign values to the three numbers
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        // Use if-else to find the greatest number
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println(num3 + " is the greatest number.");
        }
    }
}
