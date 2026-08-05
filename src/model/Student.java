package model;
public class Student {
    private int studentId;
    private String name;
    private String email;
    private String branch;
    private double cgpa;
    public Student(int studentId, String name, String email,
                   String branch, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.branch = branch;
        this.cgpa = cgpa;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getBranch() {
        return branch;
    }
    public double getCgpa() {
        return cgpa;
    }
}