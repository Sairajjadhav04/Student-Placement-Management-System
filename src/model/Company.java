package model;

public class Company {
    private int Company_id;
    private String Company_name;
    private String Company_location;
    private double Package_offered;
    private String Job_Role;
    public Company() {
    }
    // Parameterized Constructor
    public Company(int Company_id , String Company_name , String Company_Location ,
                   double Package_offered,String Job_Role)
    {
        this.Company_id = Company_id;
        this.Company_name = Company_name;
        this.Company_location=Company_Location;
        this.Package_offered=Package_offered;
        this.Job_Role=Job_Role;

    }

    public int getCompany_id() {
        return Company_id;
    }

    public void setCompany_id(int company_id) {
        Company_id = company_id;
    }
    public String getCompany_name()
    {
        return Company_name;
    }
    public void setCompany_name(String company_name) {
        Company_name = company_name;
    }
    public String getCompany_location ()
    {
        return Company_location;
    }
    public void setCompany_location(String company_location) {
        Company_location = company_location;
    }
    public double getPackage_offered() {
        return Package_offered;
    }
    public void setPackage_offered(double package_offered) {
        Package_offered = package_offered;
    }
    public String getJob_Role() {
        return Job_Role;
    }
    public void setJob_Role(String job_Role) {
        Job_Role = job_Role;
    }
    //Overriding
    @Override
    public String toString()
    {
        return  "Company{" +
                "companyId = " + Company_id +'\n'+
                "companyName = " + Company_name + '\n' +
                "location = " + Company_location + '\n' +
                "packageOffered = " + Package_offered +"LPA\n"+
                "jobRole = " + Job_Role + '\n' +
                '}';
    }
}