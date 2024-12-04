import java.util.*;

public class EntryJournal {
    private final List<JournalEntry> journalEntries = new ArrayList<>();
    private final List<String> adviceList = Arrays.asList(
            "Take a few minutes to meditate each day to reduce stress.",
            "Write down three things you're grateful for each day.",
            "Try to get at least 7-8 hours of sleep each night.",
            "Practice deep breathing when you feel overwhelmed.",
            "Go for a walk outside and enjoy nature.",
            "Connect with a friend or family member for support.",
            "Limit your screen time, especially before bed.",
            "Set small, achievable goals to help manage stress."
    );

    void addJournalEntry(Scanner scanner) {
        System.out.println("\nAdd a new Journal Entry");

        System.out.print("Mood (e.g., happy, sad, etc.): ");
        String mood = scanner.nextLine();

        System.out.print("Stress Level (1-10): ");
        int stressLevel = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Energy Level (1-10): ");
        int energyLevel = scanner.nextInt();
        scanner.nextLine();

        JournalEntry entry = new JournalEntry(mood, stressLevel, energyLevel);
        journalEntries.add(entry);
        System.out.println("Journal entry added successfully!");
    }

    public void viewJournalEntries() {
        System.out.println("\nYour Journal Entries:");
        if (journalEntries.isEmpty()) {
            System.out.println("No entries found.");
            return;
        }

        for (JournalEntry entry : journalEntries) {
            System.out.println(entry);
        }
    }

    public void setDailyGoal(Scanner scanner) {
        System.out.print("\nSet a Daily Goal: ");
        String goal = scanner.nextLine();
        System.out.println("Your goal for today: " + goal);
    }

    public void showAdviceOrTip() {
        Random random = new Random();
        String advice = adviceList.get(random.nextInt(adviceList.size()));
        System.out.println("\nAdvice/Tips:");
        System.out.println(advice);
    }
}

