package model;

public class Company_Test {

    public static void main(String[] args) {
        Company company = new Company(
                101,
                "TCS",
                "Mumbai",
                6.5,
                "Software Developer"
        );

        System.out.println("Before changing location:");
        System.out.println(company);

        company.setCompany_location("Navi-Mumbai");

        System.out.println("\nAfter changing location:");
        System.out.println(company);

    }
}