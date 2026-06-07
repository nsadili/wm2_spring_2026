# Final Project – Java Programming (Spring 2026)

## Team Composition
- Teams must consist of **2–3 students**.
- All team members must actively contribute to the project.
- Each member must be able to explain any part of the implementation during evaluation.

---

# Project Goal

Design and implement a **Java application** that solves a real-world problem using the concepts covered during the course.

The application must be fully functional as a **console-based application**.

Teams that wish to go beyond the course requirements may additionally implement a **JavaFX graphical user interface (GUI)**. JavaFX is optional and will be considered as an additional achievement rather than a requirement.

---

## **Project Ideas (Choose One)**

Students must select **one project idea** and implement it as a group work.

- **Digital Banking Simulation**
  - Add, update, delete, and list **customer profiles**.
  - Create, update, delete, and view **bank accounts** for each customer.
  - Perform **deposit**, **withdrawal**, and **money transfer** operations.
  - Record and list **transactions** for every account.
- **Student Management System**
  - Add new students; update, delete, and list existing students.
  - Add and list **courses**.
  - Enroll a student into a course; list all courses a student is enrolled in.
  - View all students enrolled in a particular course.
- **Simple Task Manager**
  - Add a new task with title, description, due date, and assigned person.
  - Update, delete, and list tasks.
  - Move tasks between statuses (e.g., "To Do", "In Progress", "Done").
  - List tasks approaching or past their deadlines and notify the assigned person.
  - View all tasks assigned to a specific person.

---

# Functional Requirements

The application must support:

1. Creating new records.
2. Viewing existing records.
3. Updating records.
4. Deleting records.
5. Searching and filtering data.
6. Saving data to files.
7. Loading data from files when the application starts.
8. Displaying useful reports or statistics.

The exact functionality depends on the chosen project topic.

---

# Mandatory Technical Requirements

The project must demonstrate the use of the following course topics.

## 1. Object-Oriented Programming

The system must include:

- At least 5 custom classes.
- Proper encapsulation.
- Constructors.
- Method overloading where appropriate.
- Inheritance.
- Polymorphism.
- Abstract classes and/or interfaces.

---

## 2. Collections Framework

The project must use Java Collections.

Examples:

- ArrayList
- HashMap
- HashSet
- Queue
- PriorityQueue

At least two different collection types must be used meaningfully.

---

## 3. Exception Handling

The application must:

- Handle invalid user input.
- Handle file-related exceptions.
- Include at least one custom exception class.

The application must never terminate unexpectedly because of user mistakes.

---

## 4. Lambda Expressions and Functional Interfaces

The project must include:

- At least one custom functional interface.
- Lambda expressions.
- Method references where appropriate.

---

## 5. Stream API

The project must use Stream API operations such as:

- filter()
- map()
- sorted()
- collect()
- count()
- anyMatch()
- allMatch()

Use streams for reporting, searching, filtering, or statistics generation.

---

## 6. File I/O

The application must:

- Store data in files.
- Load data from files.
- Prevent data loss between executions.

Possible formats:

- TXT
- CSV
- JSON (optional)

---

# User Interface Requirements

## Minimum Requirement

A menu-driven console interface.

Example:

1. Add Record
2. View Records
3. Search Records

    3.1. Update/Remove
4. Generate Report
5. Save Data
6. Exit

---

## Optional Extension

Teams may implement a JavaFX GUI.

Possible GUI features:

- Forms
- Tables
- Search screens
- Charts
- Statistics dashboards

JavaFX is not required and will not replace the mandatory console functionality.

---

# Documentation Requirements

The repository must contain a README.md file including:

- Project title
- Team members
- Problem description
- Features
- System design overview
- Class diagram (UML)
- Instructions for running the application
- Sample screenshots

---

# UML Requirement

The project must include a UML class diagram showing:

- Classes
- Attributes
- Methods
- Relationships
- Inheritance
- Interfaces

The UML diagram may be created using:

- Draw.io
- Or any similar tool

---

# Git Requirements

The project must be hosted on GitHub.

Requirements:

- Minimum 10 meaningful commits.
- Meaningful commit messages.
- Contributions from all team members.
- No single final commit containing the entire project.

---

# AI Usage Policy

AI tools may be used for:

- Learning concepts
- Understanding syntax
- Refactoring code
- Generating examples

AI tools may NOT replace understanding of the implementation.

During evaluation, students must be able to explain:

- Design decisions
- Algorithms
- Data structures
- Code implementation details

Failure to explain the submitted work may result in grade reduction.

---

# Deliverables

Submit:

1. GitHub repository link.
2. Source code.
3. README.md.
4. UML diagram.
5. Sample data files.
6. Project presentation.

---

# Evaluation Criteria (100 Points)

| Component | Points |
|------------|---------|
| Functionality | 30 |
| OOP Design | 20 |
| Collections, Streams, Lambdas | 15 |
| Exception Handling | 10 |
| File I/O | 10 |
| UML Diagram | 5 |
| Documentation (README) | 5 |
| Code Quality and Git Usage | 5 |

---

# Bonus (Up to 10 Points)

Possible bonus items:

- JavaFX GUI
- Advanced reporting
- Data visualization
- JSON persistence
- Additional design patterns
- Unit testing

Bonus points cannot increase the total score beyond the course policy limits.
