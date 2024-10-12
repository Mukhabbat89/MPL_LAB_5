import java.util.Scanner;
public class DistanceFromAverage {
    public static void main(String[] args) {
        final int MAX_ENTRIES = 15;
        double[] numbers = new double[MAX_ENTRIES];
        int count = 0;
        double sum = 0;

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for numbers
        System.out.println("Enter up to 15 double values (enter 99999 to quit):");

        while (count < MAX_ENTRIES) {
            double input = scanner.nextDouble();
            
            // Check if the user entered 99999 to quit
            if (input == 99999) {
                break;
            }
            
            // Store the input and add it to the sum
            numbers[count] = input;
            sum += input;
            count++;
        }

        // If no numbers were entered, display an error
        if (count == 0) {
            System.out.println("Error: No numbers entered.");
        } else {
            // Calculate the average
            double average = sum / count;
            System.out.println("You entered " + count + " numbers.");
            System.out.println("The average is " + average);
            
            // Display the distance of each number from the average
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(numbers[i] - average);
                System.out.println("Number " + numbers[i] + " is " + distance + " away from the average.");
            }
        }
        scanner.close();
    }
}
