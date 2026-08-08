package com.studentplacement.model;

public class Placement {
    //Placement ID
    //student ID
    //company name
    //job role
    //package/salary
    //placement status
    //Company ID and placement dates
    //these record to add in
    private int Placement_id;
    private int Student_id;
    private int Company_id;
    private String CompanyName;
    private String JobRole;
    private double salary;
    private String Placement_status;
    private String PlacementDate;
    //We are creating a default constructor
    public Placement() {
    }
    //Now to create Parameterized Constructor
    public Placement(int Placement_id,int Student_id , int Company_id ,String CompanyName , String JobRole
    , double salary , String Placement_status,String PlacementDate)
    {
        this.Placement_id = Placement_id;
        this.Student_id = Student_id;
        this.Company_id = Company_id;
        this.CompanyName = CompanyName;
        this.JobRole = JobRole;
        this.salary = salary;
        this.Placement_status = Placement_status;
        this.PlacementDate=PlacementDate;
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

    public int getCompany_id() {
        return Company_id;
    }

    public void setCompany_id(int company_id) {
        Company_id = company_id;
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

    public String getPlacementDate() {
        return PlacementDate;
    }

    public void setPlacementDate(String placementDate) {
        PlacementDate = placementDate;
    }

    //Making display function which displays output whenever it required
    @Override
    public String toString() {
        return "\nPlacement ID = " + Placement_id +
                "\nStudent ID = " + Student_id+
                "\nCompany ID = " + Company_id +
                "\nCompany Name = " + CompanyName +
                "\nPlacement Date = " + PlacementDate+
                "\nStatus = " + Placement_status;
    }
}