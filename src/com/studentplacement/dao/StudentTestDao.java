package com.studentplacement.dao;
import com.studentplacement.model.Student;
public class StudentTestDao {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        // Add Students
        dao.addStudent(new Student(101, "Saish Naik", "saish@gmail.com", "AI & DS", 9.55));
        dao.addStudent(new Student(102, "Sairaj Jadhav", "sairaj@gmail.com", "AI & DS", 9.70));
        dao.addStudent(new Student(103, "Samarth Shetty", "samarth@gmail.com", "Mechanical", 8.90));
        System.out.println("\n\tAll Students");
        dao.displayAllStudents();
        System.out.println("\n\tStudent with ID 102");
        dao.displayStudentById(102);
        System.out.println("\n\tUpdate Student 102 ");
        dao.updateStudent(102, "Sandeep Kumar", "sandeep.sharma@gmail.com", "AI & DS", 9.22);
        System.out.println("\n\tUpdated Record ");
        dao.displayStudentById(102);
        System.out.println("\n\tDelete Student 103 ");
        dao.deleteStudent(103);
        System.out.println("\n\tStudents After Deletion");
        dao.displayAllStudents();
    }
}