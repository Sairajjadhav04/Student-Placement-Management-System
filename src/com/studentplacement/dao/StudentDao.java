package com.studentplacement.dao;
import com.studentplacement.model.Student;
import java.util.ArrayList;
public class StudentDao {
    private ArrayList<Student> studentList = new ArrayList<>();
    // Add Student
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }
    // Display All Students
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        for (Student student : studentList) {
            student.display();
            System.out.println("\n");
        }
    }
    // Display Particular Student
    public void displayStudentById(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }
    // Update Student
    public void updateStudent(int studentId, String name,
                              String email, String branch, double cgpa) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                student.setName(name);
                student.setEmail(email);
                student.setBranch(branch);
                student.setCgpa(cgpa);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    // Delete Student
    public void deleteStudent(int studentId) {

        for (Student student : studentList) {

            if (student.getStudentId() == studentId) {
                studentList.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}