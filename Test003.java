import java.util.Scanner;

public class Test003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Do you want to see the message? (yes/no): ");
        String reply = scanner.nextLine().trim().toLowerCase(); // Normalize the input

        // Respond based on the user's reply
        if (reply.equals("yes")) {
            System.out.println("Happy Sankranthi to all participants!");
        } else if (reply.equals("no")) {
            System.err.println("Error: You chose not to see the message.");
        } else {
            System.err.println("Invalid input. Please reply with 'yes' or 'no'.");
        }

        scanner.close(); // Close the scanner
    }
}
