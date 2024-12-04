import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration registration = new Registration();
        Login login = new Login();

        System.out.println("Welcome! Choose an option: ");
        System.out.println("1. Register");
        System.out.println("2. Login");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            User user = new User(username, password);
            boolean registered = registration.registerUser(user);
            if (registered) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Registration failed.");
            }
        } else if (choice == 2) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            boolean authenticated = login.authenticateUser(username, password);
            if (authenticated) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
