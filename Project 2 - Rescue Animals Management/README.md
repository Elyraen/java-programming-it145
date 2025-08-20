# Rescue Animals Management (Global Rain – Grazioso Salvare)

This project was completed for **Global Rain**, a software engineering company specializing in custom software solutions. As a junior developer on the team, I contributed to the **Grazioso Salvare project**, which supports an international organization that trains animals for search-and-rescue missions. The goal was to extend and refine the existing Java application that helps track, search, and reserve rescue animals.

---

## 📊 Project Overview
- **Client:** Grazioso Salvare  
- **Company:** Global Rain  
- **Objective:** Extend an existing rescue animal management system with new features and classes.  
- **Focus Areas:**
  - Create a new `Monkey` class that inherits from `RescueAnimal`  
  - Modify the `Driver` class to add menu functionality, intake methods, and reporting  
  - Implement input validation, reservation functionality, and formatted output  
  - Demonstrate best practices in OOP and inline code documentation  

---

## 📂 Deliverables
- `Monkey.java` — New subclass implementing rescue monkey attributes and behaviors  
- `Driver.java` — Updated driver class with menu system, input validation, and management methods  
- `Dog.java` & `RescueAnimal.java` — Provided starter files (modified where needed)  
- `README.md` — This documentation file  

---

## 🔧 Implemented Features
- **Menu Loop in Driver:** Displays options, validates input, and routes actions  
- **Intake Methods:**  
  - `intakeNewDog()` → Adds a new dog with validated attributes  
  - `intakeNewMonkey()` → Adds a new monkey with validated species and name  
- **Reservation System:**  
  - `reserveAnimal()` → Allows reserving an available animal based on type and country  
- **Print Methods:**  
  - Outputs available dogs or monkeys  
  - Optionally prints all animals “in service” and “available”  

---

## 🧠 Object-Oriented Principles Applied
- **Inheritance:** `Monkey` inherits from `RescueAnimal`, extending functionality with species-specific attributes  
- **Encapsulation:** Attributes are private and accessed through getters and setters  
- **Abstraction:** Classes represent real-world objects (dogs, monkeys, rescue animals)  
- **Maintainability:** Code is consistently commented, making it easier for other developers to extend and debug  

---

## 🛠 Tools & Technologies
- Java (Eclipse IDE)  
- UML Class Diagrams  
- ArrayLists for managing dynamic collections of animals  
- Command-line interface for input/output  

---

## 🎯 Conclusion
This project demonstrates how **object-oriented programming (OOP)** principles can be applied to a real-world software system. By extending existing functionality with a new `Monkey` class, refining the `Driver` class, and implementing robust input validation, this work contributes to a reliable, maintainable rescue animal management system for **Grazioso Salvare**.
