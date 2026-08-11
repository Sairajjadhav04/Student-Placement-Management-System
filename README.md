# Student Placement Management System

A beginner-friendly Java console application for managing students, companies, and placement records.

## Project Overview

The Student Placement Management System is developed using Core Java and follows a simple layered architecture.

The system allows users to:

* Add student records
* Display all students
* Search students by ID
* Update student records
* Delete student records
* Add company records
* Display all companies
* Search companies by ID
* Update company records
* Delete company records
* Add placement records
* Display all placement records
* Search placements by ID
* Update placement records
* Delete placement records
* Validate user input
* Handle invalid input using a custom exception

## Technologies Used

* Java
* IntelliJ IDEA
* Git
* GitHub

No database, Maven, Spring Boot, or external framework is used.

## Project Architecture

```text
Main
  ↓
InputValidation
  ↓
Service Layer
  ↓
DAO Layer
  ↓
Model
```

### Model Layer

Contains the main data classes:

* `Student.java`
* `Company.java`
* `Placement.java`

### DAO Layer

Responsible for CRUD operations:

* `StudentDao.java`
* `CompanyDao.java`
* `PlacementDao.java`

### Service Layer

Connects the main application with the DAO layer:

* `StudentService.java`
* `CompanyService.java`
* `PlacementService.java`

### Utility Layer

Handles input validation and custom exceptions:

* `InputValidation.java`
* `InvalidInputException.java`

### Main Class

`Main.java` provides the menu-driven console interface for the entire application.

## Validation

The project includes validation for:

### Student

* Student ID
* Student name
* Email
* Branch
* CGPA

### Company

* Company ID
* Company name
* Location
* Package
* Job role

### Placement

* Placement ID
* Company ID
* Student ID
* Company name
* Job role
* Salary
* Placement status
* Placement date

Invalid input is handled using the custom `InvalidInputException`.

## CRUD Operations

The application supports:

```text
Create
Read
Update
Delete
```

for:

```text
Student
Company
Placement
```

## Project Structure

```text
src
└── com.studentplacement
    ├── model
    │   ├── Student.java
    │   ├── Company.java
    │   └── Placement.java
    │
    ├── dao
    │   ├── StudentDao.java
    │   ├── StudentDaoTest.java
    │   ├── CompanyDao.java
    │   ├── CompanyDaoTest.java
    │   ├── PlacementDao.java
    │   └── PlacementDaoTest.java
    │
    ├── service
    │   ├── StudentService.java
    │   ├── CompanyService.java
    │   └── PlacementService.java
    │
    ├── util
    │   ├── InputValidation.java
    │   └── InvalidInputException.java
    │
    └── Main.java
```

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure Java is configured correctly.
3. Open:

```text
src/com.studentplacement/Main.java
```

4. Run the `main()` method.
5. Select the required option from the console menu.

## Example Main Menu

```text
Student Placement Management System

1. Student Management System
2. Company Management System
3. Placement Management System
4. Exit
```

## Learning Objectives

This project demonstrates practical use of:

* Java OOP
* Classes and objects
* Encapsulation
* Constructors
* Packages
* CRUD operations
* DAO pattern
* Service layer
* Exception handling
* Custom exceptions
* Input validation
* Scanner
* Menu-driven console applications
* Git and GitHub

## Future Scope

The project can be extended in the future with:

* Database connectivity
* GUI or web interface
* User authentication
* Student eligibility checking
* Placement reports
* Search and filtering
* Spring Boot backend

These features are outside the scope of the current console-based version.

## Author

Student Placement Management System
Developed as a Java academic project.
