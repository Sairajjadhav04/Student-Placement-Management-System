package com.studentplacement;
import com.studentplacement.model.Company;
import com.studentplacement.model.Placement;
import com.studentplacement.model.Student;
import com.studentplacement.service.StudentService;
import com.studentplacement.service.CompanyService;
import com.studentplacement.service.PlacementService;
import com.studentplacement.util.InputValidation;
import java.util.Scanner;
public class Main {
    public void StudentManagement(Scanner sc) {
        StudentService sd = new StudentService();
        int choices;
        do {
            System.out.println("\tStudent Management System");
            System.out.println("1. Add the Student ");
            System.out.println("2. Show all Students ");
            System.out.println("3. Delete the student ");
            System.out.println("4. Update the student ");
            System.out.println("5. Search the student ");
            System.out.println("6. Exit");
            choices = InputValidation.readInt(sc, "Enter your choice : ");
            switch (choices) {
                case 1:
                    System.out.println("\tAdd the Student ");
                    int id = InputValidation.readInt(sc, "Enter Student ID: ");
                    String name = InputValidation.readString(
                            sc, "Enter Name: ");
                    String email = InputValidation.readEmail(
                            sc, "Enter Email: ");
                    String branch = InputValidation.readString(
                            sc, "Enter Branch: ");
                    double cgpa = InputValidation.readCgpa(
                            sc, "Enter CGPA: ");
                    Student S = new Student(
                            id, name, email, branch, cgpa);
                    sd.addStudent(S);
                    break;

                case 2:
                    System.out.println("\tDisplay all Students");
                    sd.displayAllStudents();
                    break;

                case 3:
                    System.out.println("\tDelete the Student");

                    int Delete_ID = InputValidation.readInt(
                            sc, "Enter Student Id to delete : ");

                    sd.deleteStudent(Delete_ID);
                    break;

                case 4:
                    System.out.println("\tUpdate the Student ");

                    int update_id = InputValidation.readInt(
                            sc, "Enter new Student ID: ");

                    String update_name = InputValidation.readString(
                            sc, "Enter new Name: ");

                    String update_email = InputValidation.readEmail(
                            sc, "Enter new Email: ");

                    String update_branch = InputValidation.readString(
                            sc, "Enter new Branch: ");

                    double update_cgpa = InputValidation.readCgpa(
                            sc, "Enter new CGPA: ");

                    sd.updateStudent(
                            update_id,
                            update_name,
                            update_email,
                            update_branch,
                            update_cgpa);

                    break;

                case 5:
                    System.out.println("\tSearch the Student");

                    int Search_id = InputValidation.readInt(
                            sc, "Enter ID to search the student : ");

                    sd.displayStudentById(Search_id);
                    break;

                case 6:
                    System.out.println(
                            "Thank you for your response visit again !! ");
                    break;

                default:
                    System.out.println(
                            "Invalid choice , Enter correct choice !");
            }

        } while (choices != 6);
    }


    public void CompanyManagement(Scanner sc) {

        int choice;
        CompanyService cd = new CompanyService();

        do {
            System.out.println("\n\tCompany Management System");
            System.out.println("1. Add Company ");
            System.out.println("2. Display all Companies");
            System.out.println("3. Search Company by ID");
            System.out.println("4. Update Company records");
            System.out.println("5. Delete Company records");
            System.out.println("6. Exit");

            choice = InputValidation.readInt(
                    sc, "Enter your choice : ");

            switch (choice) {

                case 1:
                    System.out.println("\tAdd Company ");

                    int Id = InputValidation.readInt(
                            sc, "\nEnter the Company ID : ");

                    String name = InputValidation.readString(
                            sc, "Enter Company Name : ");

                    String location = InputValidation.readString(
                            sc, "Enter Company Location : ");

                    float c_package = InputValidation.readFloat(
                            sc, "Enter Package Offered : ");

                    String JobRole = InputValidation.readString(
                            sc, "Enter Job Role : ");

                    Company C = new Company(
                            Id,
                            name,
                            location,
                            c_package,
                            JobRole);

                    cd.addCompany(C);
                    break;

                case 2:
                    System.out.println("Display all Companies : ");
                    cd.displayAllCompanies();
                    break;

                case 3:
                    System.out.println("Search Company by id");

                    int id = InputValidation.readInt(
                            sc, "Enter Company ID : ");

                    cd.displayCompanyById(id);
                    break;

                case 4:
                    System.out.println("Update Company records ");

                    int up_Id = InputValidation.readInt(
                            sc, "\nEnter new Company ID : ");

                    String up_name = InputValidation.readString(
                            sc, "Enter new Company Name : ");

                    String up_location = InputValidation.readString(
                            sc, "Enter new Company Location : ");

                    float up_c_package = InputValidation.readFloat(
                            sc, "Enter new Package Offered : ");

                    String up_JobRole = InputValidation.readString(
                            sc, "Enter new Job Role : ");

                    cd.updateCompany(
                            up_Id,
                            up_name,
                            up_location,
                            up_c_package,
                            up_JobRole);

                    break;

                case 5:
                    System.out.println("Delete Company Records");

                    int d_id = InputValidation.readInt(
                            sc, "Enter Company ID : ");

                    cd.deleteCompany(d_id);
                    break;

                case 6:
                    System.out.println(
                            "Thank you for visiting ! ");
                    break;

                default:
                    System.out.println("Invalid Choice !! ");
            }

        } while (choice != 6);
    }


    public void PlacementManagement(Scanner sc) {

        PlacementService pd = new PlacementService();
        int choice;

        do {
            System.out.println("\n\tPlacement Management System");
            System.out.println("1. Add Placement ");
            System.out.println("2. Display all placements ");
            System.out.println("3. Display placement record by ID");
            System.out.println("4. Update Placement records ");
            System.out.println("5. Delete Placement records ");
            System.out.println("6. Exit");

            choice = InputValidation.readInt(
                    sc, "Enter your choice : ");

            switch (choice) {

                case 1:
                    System.out.println("\n\tAdd Placement");

                    int ID = InputValidation.readInt(
                            sc, "Enter Placement ID : ");

                    int co_id = InputValidation.readInt(
                            sc, "Enter Company ID : ");

                    int st_id = InputValidation.readInt(
                            sc, "Enter Student ID : ");

                    String cname = InputValidation.readString(
                            sc, "Enter Company name : ");

                    String jr = InputValidation.readString(
                            sc, "Enter Job Role : ");

                    double sal = InputValidation.readDouble(
                            sc, "Enter salary offered : ");

                    String status = InputValidation.readString(
                            sc, "Enter Placement Status : ");

                    String date = InputValidation.readString(
                            sc, "Enter Placement Date : ");

                    Placement p = new Placement(
                            ID,
                            co_id,
                            st_id,
                            cname,
                            jr,
                            sal,
                            status,
                            date);

                    pd.addPlacement(p);
                    break;

                case 2:
                    System.out.println(
                            "\tDisplay all Placements Records ");

                    pd.displayAllPlacements();
                    break;

                case 3:
                    System.out.println(
                            "\tDisplay Placement by ID ");

                    int id = InputValidation.readInt(
                            sc, "Enter Placement ID : ");

                    pd.displayPlacementById(id);
                    break;

                case 4:
                    System.out.println(
                            "\tUpdate Placement Records ");

                    int up_ID = InputValidation.readInt(
                            sc, "Enter Placement ID : ");

                    int up_co_id = InputValidation.readInt(
                            sc, "Enter Company ID : ");

                    int up_st_id = InputValidation.readInt(
                            sc, "Enter Student ID : ");

                    String up_cname = InputValidation.readString(
                            sc, "Enter Company name : ");

                    String up_jr = InputValidation.readString(
                            sc, "Enter Job Role : ");

                    double up_sal = InputValidation.readDouble(
                            sc, "Enter salary offered : ");

                    String up_status = InputValidation.readString(
                            sc, "Enter Placement Status : ");

                    String up_date = InputValidation.readString(
                            sc, "Enter Placement Date : ");
                    pd.updatePlacement(
                            up_ID,
                            up_co_id,
                            up_st_id,
                            up_cname,
                            up_jr,
                            up_sal,
                            up_status,
                            up_date);
                    break;
                case 5:
                    System.out.println(
                            "\tDelete Placement Records ");

                    int del_id = InputValidation.readInt(
                            sc, "Enter Placement ID : ");
                    pd.deletePlacement(del_id);
                    break;
                case 6:
                    System.out.println(
                            "\nThank you for visiting !!");
                    break;
                default:
                    System.out.println("Invalid choice !!");
            }
        } while (choice != 6);
    }
    public static void main(String[] args) {
        int choices;
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        do {
            System.out.println("\n\tStudent Placement Management System");
            System.out.println("1. Student Management System");
            System.out.println("2. Company Management System");
            System.out.println("3. Placement Management System");
            System.out.println("4. Exit");
            choices = InputValidation.readInt(
                    sc, "\nEnter your choice : ");
            switch (choices) {
                case 1:
                    m.StudentManagement(sc);
                    break;
                case 2:
                    m.CompanyManagement(sc);
                    break;
                case 3:
                    m.PlacementManagement(sc);
                    break;
                case 4:
                    System.out.println(
                            "Thank you for visiting !!");
                    break;
                default:
                    System.out.println(
                            "Invalid choice, Select right choice");
            }
        } while (choices != 4);
        sc.close();
    }
}