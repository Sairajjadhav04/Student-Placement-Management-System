package com.studentplacement.service;
import com.studentplacement.dao.CompanyDao;
import com.studentplacement.model.Company;
public class CompanyService {
    private CompanyDao cd;
    public CompanyService() {
        cd = new CompanyDao();
    }
    public void addCompany(Company company) {
        cd.addCompany(company);
    }
    public void displayAllCompanies() {
        cd.displayAllCompanies();
    }
    public void displayCompanyById(int companyId) {
        cd.displayCompanyById(companyId);
    }
    public void updateCompany(int companyId, String name, String location,
                              float c_package, String jobRole) {
        cd.updateCompany(companyId, name, location, c_package, jobRole);
    }
    public void deleteCompany(int companyId) {
        cd.deleteCompany(companyId);
    }
}