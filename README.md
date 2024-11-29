# 🌼 **TalaDamdamin: Mental Health Journal** 🌼

Welcome to **TalaDamdamin**, your personal mental health companion! This Java-based console application empowers users to track their mental well-being, reflect through journal entries, set daily goals, and gain insights with curated mental health advice. Designed with **Object-Oriented Programming (OOP)** principles, the application features robust user authentication and seamless database integration with **MySQL**. 🌟

---

## 🧠 **Why TalaDamdamin?**

In a fast-paced world, prioritizing mental health is essential. **TalaDamdamin** is here to provide a safe, simple, and insightful tool to support your wellness journey. Think of it as a beacon of light guiding you toward self-discovery and balance. 💙

---

## ⚙️ **Key Features**

- ✍️ **Personal Journaling:** Reflect on your thoughts and emotions with secure journal entries.
- 🎯 **Daily Goals:** Stay focused and intentional with customizable daily objectives.
- 🌱 **Wellness Advice:** Access tips and insights to nurture your mental health.
- 🔐 **Secure Login System:** Protect your data with user authentication.
- 🗂️ **Database Integration:** All entries and data are securely stored using **MySQL**.

---

## 🚀 **OOP Principles in Action**

### **1️⃣ Encapsulation**
- **User Class:** Safeguards user-specific data like username and password with private attributes and public getters.  
- **EntryJournal Class:** Manages journal data while keeping entries and operations secure.  
- **DatabaseConnection Class:** Centralizes database logic for streamlined management.

### **2️⃣ Abstraction**
- Simplifies database interactions via a dedicated `DatabaseConnection` class.  
- High-level methods like `addJournalEntry()` allow users to interact seamlessly without knowing implementation details.

### **3️⃣ Inheritance**
- Prepare for scalability! Subclasses like `TherapistUser` or `MoodEntry` can inherit and extend core classes for additional functionality.  

### **4️⃣ Polymorphism**
- Dynamically adapt methods like `addJournalEntry()` to user input.  
- Lay the groundwork for method overloading to support enhanced entry customization.

### **🎉 Benefits**
Readable code, reusable components, maintainable structure, and future-ready scalability!  

---

## 🌍 **Contributing to the SDGs**

TalaDamdamin supports **UN SDG 3: Good Health and Well-being**, promoting mental wellness through:  
- Journaling for self-awareness.  
- Goal setting for a balanced life.  
- Advice for actionable self-care.

Future updates could include mood analytics, personalized tips, and a community support platform to amplify its positive impact! 🌟  

---

## 🛠️ **Getting Started**

### **Prerequisites**
- **JDK 8** or higher  
- **MySQL Workbench** for database management  
- An IDE like **IntelliJ IDEA** or **Eclipse**  

### **Setup Instructions**

1. **Clone the Repository**  
   ```bash

2. **Set Up the Database**
Execute MentalHealthJournal_Query.sql in MySQL Workbench.
Update database credentials in the DatabaseConnection class (URL, USER, PASSWORD).
Run the Application

3. **Registration: Create a new user account.**
Login: Access your journal with secure authentication.
Explore: Add entries, review past reflections, set goals, and discover advice!

---

## 🎨 **Future Enhancements**

- 🌈 Mood tracking and visualization  
- 📊 Analytics for behavioral patterns  
- 🫂 Community support integration  
- 🎯 Personalized self-care recommendations  
