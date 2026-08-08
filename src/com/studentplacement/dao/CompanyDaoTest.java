package com.studentplacement.dao;
import com.studentplacement.model.Company;
public class CompanyDaoTest {
    public static void main(String[] args) {
        CompanyDao companyDao = new CompanyDao();
        System.out.println("\n\t ADD COMPANIES ");
        Company company1 = new Company(
                101,
                "TCS",
                "Mumbai",
                7.5,
                "Software Developer"
        );
        Company company2 = new Company(
                102,
                "Infosys",
                "Pune",
                8.0,
                "Java Developer"
        );
        Company company3 = new Company(
                103,
                "Accenture",
                "Mumbai",
                9.0,
                "Data Analyst"
        );
        companyDao.addCompany(company1);
        companyDao.addCompany(company2);
        companyDao.addCompany(company3);
        System.out.println("\n\t ALL COMPANIES ");
        companyDao.displayAllCompanies();
        System.out.println("\n\t SEARCH COMPANY ");
        companyDao.displayCompanyById(102);
        System.out.println("\n\t UPDATE COMPANY ");
        companyDao.updateCompany(
                102,
                "Infosys Limited",
                "Pune",
                10.0,
                "Java Full Stack Developer"
        );
        // Display updated company
        companyDao.displayCompanyById(102);
        System.out.println("\n\t DELETE COMPANY ");
        companyDao.deleteCompany(103);
        // Display companies after deletion
        System.out.println("\n\tCOMPANIES AFTER DELETE ");
        companyDao.displayAllCompanies();
    }
}

