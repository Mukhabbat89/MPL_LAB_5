import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        // Available services and their prices
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a service
        System.out.println("                       ");
        System.out.println("Available services:\n oil change, tire rotation, battery check, brake inspection");
        System.out.print("Enter the service you would like: ");
        String choice = scanner.nextLine().toLowerCase();

            // Find the service and display the price
        boolean serviceFound = false;
        for (int i = 0; i < services.length; i++) {
            if (services[i].equals(choice)) {
                System.out.println("The price of " + services[i] + " is $" + prices[i]);
                serviceFound = true;
                break;
            }
        }

        // If the service is not found, display an error message
        if (!serviceFound) {
            System.out.println("Error: Invalid service selected.");
        }
        scanner.close();
}
}