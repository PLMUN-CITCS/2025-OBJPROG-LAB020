import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            if (handleMenuChoice(choice, scanner)) {
                break;
            }
        }
        
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    public static boolean handleMenuChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd(scanner);
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                return true; // Signal to exit the program loop
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }
        return false; // Signal to continue the program loop
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}