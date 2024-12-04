import java.util.*;
import java.text.SimpleDateFormat;

// Define the main MentalHealthJournal class
public class MentalHealthJournal {
    public static void main(String[] args) {
        MentalHealthJournal app = new MentalHealthJournal();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        EntryJournal entry = new EntryJournal();

        while (running) {
            System.out.println("\nMental Health Journal");
            System.out.println("1. Add Journal Entry");
            System.out.println("2. View Journal Entries");
            System.out.println("3. Set Daily Goal");
            System.out.println("4. Get Advice or Tip");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    entry.addJournalEntry(scanner);
                    break;
                case 2:
                    entry.viewJournalEntries();
                    break;
                case 3:
                    entry.setDailyGoal(scanner);
                    break;
                case 4:
                    entry.showAdviceOrTip();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}

// Define the JournalEntry class
