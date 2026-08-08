package com.studentplacement.dao;
import com.studentplacement.model.Company;
import java.util.ArrayList;
public class CompanyDao {
    private ArrayList<Company> CompanyList = new ArrayList<>();
    // Add Company
    public void addCompany(Company cp) {
        CompanyList.add(cp);
        System.out.println("Company added successfully.");
    }
    // Display All Companies
    public void displayAllCompanies() {
        if (CompanyList.isEmpty()) {
            System.out.println("No company records found.");
            return;
        }
        for (Company cp : CompanyList) {
            System.out.println(cp);
        }
    }
    // Display Particular Company
    public void displayCompanyById(int companyID) {
        for (Company cp : CompanyList) {
            if (cp.getCompany_id() == companyID) {
                System.out.println(cp);
                return;
            }
        }
        System.out.println("Company not found.");
    }
    // Update Company
    public void updateCompany(int companyID,
                              String name,
                              String location,
                              double packageOffered,
                              String jobRole) {
        for (Company cp : CompanyList) {
            if (cp.getCompany_id() == companyID) {
                cp.setCompany_name(name);
                cp.setCompany_location(location);
                cp.setPackage_offered(packageOffered);
                cp.setJob_Role(jobRole);
                System.out.println("Company updated successfully.");
                return;
            }
        }
        System.out.println("Company not found.");
    }
    // Delete Company
    public void deleteCompany(int companyID) {
        for (Company cp : CompanyList) {
            if (cp.getCompany_id() == companyID) {
                CompanyList.remove(cp);
                System.out.println("Company deleted successfully.");
                return;
            }
        }
        System.out.println("Company not found.");
    }
}

