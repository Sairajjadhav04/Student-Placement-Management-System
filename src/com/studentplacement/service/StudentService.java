package com.studentplacement.service;
import com.studentplacement.dao.StudentDao;
import com.studentplacement.model.Student;
public class StudentService {
    private StudentDao sd;
    public StudentService() {
        sd = new StudentDao();
    }
    public void addStudent(Student student) {
        sd.addStudent(student);
    }
    public void displayAllStudents() {
        sd.displayAllStudents();
    }
    public void deleteStudent(int studentId) {
        sd.deleteStudent(studentId);
    }
    public void updateStudent(int studentId, String name, String email,
                              String branch, double cgpa) {
        sd.updateStudent(studentId, name, email, branch, cgpa);
    }
    public void displayStudentById(int studentId) {
        sd.displayStudentById(studentId);
    }
}