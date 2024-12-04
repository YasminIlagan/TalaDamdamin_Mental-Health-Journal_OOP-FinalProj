    import java.text.SimpleDateFormat;
    import java.util.Date;

    class JournalEntry {
        private final String mood;
        private final int stressLevel;
        private final int energyLevel;
        private final String date;

        public JournalEntry(String mood, int stressLevel, int energyLevel) {
            this.mood = mood;
            this.stressLevel = stressLevel;
            this.energyLevel = energyLevel;
            this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        }

        @Override
        public String toString() {
            return "Date: " + date +
                    "\nMood: " + mood +
                    "\nStress Level: " + stressLevel +
                    "\nEnergy Level: " + energyLevel +
                    "\n";
        }
    }