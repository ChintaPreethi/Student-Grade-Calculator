# 🎓 Student Grade Calculator

A simple Java console application that calculates a student's total marks, percentage, grade, and pass/fail result.

The user can enter the number of subjects, subject names, and marks. The program then generates a formatted student result.

## ✨ Features

* Enter student name
* Enter student roll number
* Choose the number of subjects
* Enter subject names
* Enter marks for each subject
* Validate marks between 0 and 100
* Calculate total marks
* Calculate percentage
* Calculate grade
* Display PASS or FAIL
* Display a formatted result

## 🛠️ Technologies Used

* Java
* Scanner
* Arrays
* Loops
* Conditional Statements

## 📁 Project Structure

```text
Student-Grade-Calculator/
│
└── StudentGradeCalculator.java
```

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Open the project

```bash
cd Student-Grade-Calculator
```

### 3. Compile the Java program

```bash
javac src/StudentGradeCalculator.java
```

### 4. Run the program

```bash
java -cp src StudentGradeCalculator
```

## 💻 Example

```text
Enter student name: Afrin
Enter roll number: 101
Enter number of subjects: 4

Enter subject 1 name: Java
Enter marks for Java (0-100): 85

Enter subject 2 name: DBMS
Enter marks for DBMS (0-100): 78

Enter subject 3 name: Python
Enter marks for Python (0-100): 92

Enter subject 4 name: HTML
Enter marks for HTML (0-100): 88

=================================
          STUDENT RESULT
=================================
Name       : Afrin
Roll No    : 101
---------------------------------
Java            : 85.00
DBMS            : 78.00
Python          : 92.00
HTML            : 88.00
---------------------------------
Total      : 343.00 / 400.00
Percentage : 85.75%
Grade      : A
Result     : PASS
=================================
```

## 📊 Grading System

| Percentage | Grade |
| ---------- | ----- |
| 90–100     | A+    |
| 80–89      | A     |
| 70–79      | B     |
| 60–69      | C     |
| 50–59      | D     |
| Below 50   | F     |

## 📚 Concepts Learned

This project demonstrates:

* User input using `Scanner`
* Arrays
* `for` and `while` loops
* `if-else` statements
* Input validation
* Mathematical calculations
* Formatted console output
* Ternary operator

## 👩‍💻 Author

**Preethi c**
