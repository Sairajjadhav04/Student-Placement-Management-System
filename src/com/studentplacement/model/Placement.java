package com.studentplacement.model;

public class Placement {
    //Placement ID
    //student ID
    //company name
    //job role
    //package/salary
    //placement status
    //these record to add in
    private int Placement_id;
    private int Student_id;
    private String CompanyName;
    private String JobRole;
    private double salary;
    private String Placement_status;
    //We are creating a default constructor
    public Placement() {
    }
    //Now to create Parameterized Constructor
    public Placement(int Placement_id,int Student_id , String CompanyName , String JobRole
    , double salary , String Placement_status)
    {
        this.Placement_id = Placement_id;
        this.Student_id = Student_id;
        this.CompanyName = CompanyName;
        this.JobRole = JobRole;
        this.salary = salary;
        this.Placement_status = Placement_status;
    }
    //Using Getters and Setters Method to access or change them
    public int getPlacement_id() {
        return Placement_id;
    }

    public void setPlacement_id(int placement_id) {
        Placement_id = placement_id;
    }

    public int getStudent_id() {
        return Student_id;
    }
    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getJobRole() {
        return JobRole;
    }

    public void setJobRole(String jobRole) {
        JobRole = jobRole;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPlacement_status() {
        return Placement_status;
    }

    public void setPlacement_status(String placement_status) {
        Placement_status = placement_status;
    }
    //Making display function which displays output whenever it required
    public void display()
    {
        System.out.println("Placement ID : "+Placement_id);
        System.out.println("Student ID : "+Student_id);
        System.out.println("Company Name : "+CompanyName);
        System.out.println("Job Role : "+JobRole);
        System.out.println("Package offered : "+salary+" LPA");
        System.out.println("Placement status : "+Placement_status);
    }
}