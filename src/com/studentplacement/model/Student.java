package com.studentplacement.model;
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
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void display ()
    {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Branch : " + branch);
        System.out.println("Overall CGPA : " + cgpa);
    }
}