# TalaDamdamin: Mental Health Journal

## I. Project Overview

The Mental Health Journal is a Java console application designed to help users track their mental well-being. Users can add journal entries, view past entries, set daily goals, and receive helpful mental health advice. The application incorporates user authentication and uses a MySQL database to manage user data securely. It showcases essential Object-Oriented Programming (OOP) concepts, providing a strong and scalable foundation for future enhancements.

## II. Application of OOP Principles

### 1. Encapsulation
. User Class: This class encapsulates user-specific data, such as username and password, and restricts access to these attributes by making them private. Public getter methods are provided to allow controlled access. The Login and Registration classes provide methods to authenticate and register users, respectively.
. EntryJournal Class: This class encapsulates journal-related data and functionality, such as adding and viewing journal entries, setting daily goals, and showing advice. Private data members ensure secure data handling, and public methods manage journal operations.
. DatabaseConnection Class: Encapsulates the database connection logic. The getConnection() method centralizes the database configuration details, making the connection setup modular and reusable throughout the application.


### 2. Abstraction
. DatabaseConnection Class: Abstracts the complexity of establishing a database connection using JDBC. Other parts of the application can obtain a database connection without knowing the underlying implementation.
. Main Class: Handles user interactions and uses high-level methods like addJournalEntry(), viewJournalEntries(), and setDailyGoal() to simplify the process. Users interact with the application without needing to understand the underlying details.

### 3. Inheritance
. User Subclasses: The system could be expanded to support different user roles (e.g., regular users or therapists) by creating subclasses that inherit from the User class, adding role-specific attributes or methods.
. Future Inheritance Possibilities: A base class, JournalEntry, can be extended to create specialized entry types, such as MoodEntry or GratitudeEntry, if more features are added in the future.


### 4. Polymorphism
. Dynamic Method Dispatch: Methods like addJournalEntry() and showAdviceOrTip() demonstrate how the same method can behave differently based on user input and internal logic.
. Overloading: You can extend the project to include overloaded methods for more flexible journal entry input options (e.g., entering mood as a string or selecting from predefined options).


###  Benefits of OOP Principles in the Project
Readability: Encapsulation and abstraction make the code easier to read and maintain.
Reusability: Inheritance and polymorphism allow for code reuse, which simplifies future feature additions.
Maintainability: Encapsulation ensures that modifications to one part of the code do not affect unrelated components.
Scalability: The modular structure supports the addition of new features, such as advanced analytics or expanded user roles, with minimal effort.


## III. Integration of the Sustainable Development Goal (SDG)
This project aligns with SDG 3: Good Health and Well-being. By providing tools to track mental health, set goals, and receive advice, the app supports mental wellness. Future updates could include features like mood pattern analysis, personalized self-care tips, or community support integration, further enhancing its impact.


## IV. Instructions for Running the Program
Prerequisites: 
. JDK 8 or higher
. MySQL Workbench for database management
. An IDE like IntelliJ IDEA or Eclipse

### Setup Instructions:
1. Clone the Repository: Obtain the source code from the project's repository.
2. Database Setup:
      > Execute the MentalHealthJournal_Query.sql file in MySQL Workbench to set up the database.
      > Update the URL, USER, and PASSWORD in the DatabaseConnection class to match your MySQL configuration.
3. Run the Application:
      > Registration: Create a new account or use a preloaded user.
      > Login: Log in using your credentials to access the journal features.
      > Journal Features: Add entries, view them, set goals, or get wellness tips.

