package com.studentplacement;
import com.studentplacement.model.Company;
import com.studentplacement.model.Placement;
import com.studentplacement.model.Student;
import com.studentplacement.service.StudentService;
import com.studentplacement.service.CompanyService;
import com.studentplacement.dao.PlacementDao;
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
            System.out.print("Enter your choice : ");
            choices = sc.nextInt();
            sc.nextLine();
            switch (choices) {
                case 1:
                    System.out.println("\tAdd the Student ");
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();
                    Student S = new Student(id, name, email, branch, cgpa);
                    sd.addStudent(S);
                    break;
                case 2:
                    System.out.println("\tDisplay all Students");
                    sd.displayAllStudents();
                    break;
                case 3:
                    System.out.println("\tDelete the Student");
                    System.out.println("Enter Student Id to delete : ");
                    int Delete_ID = sc.nextInt();
                    sd.deleteStudent(Delete_ID);
                    break;
                case 4:
                    System.out.println("\tUpdate the Student ");
                    System.out.print("Enter new Student ID: ");
                    int update_id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name: ");
                    String update_name = sc.nextLine();
                    System.out.print("Enter new Email: ");
                    String update_email = sc.nextLine();
                    System.out.print("Enter new Branch: ");
                    String update_branch = sc.nextLine();
                    System.out.print("Enter new CGPA: ");
                    double update_cgpa = sc.nextDouble();
                    Student Update_Student =
                            new Student(update_id, update_name, update_email,
                                    update_branch, update_cgpa);
                    sd.updateStudent(update_id, update_name, update_email,
                            update_branch, update_cgpa);
                    break;
                case 5:
                    System.out.println("\tSearch the Student");
                    System.out.println("Enter ID to search the student : ");
                    int Search_id = sc.nextInt();
                    sd.displayStudentById(Search_id);
                    break;
                case 6:
                    System.out.println("Thank you for your response visit again !! ");
                    break;
                default:
                    System.out.println("Invalid choice , Enter correct choice !");
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
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\tAdd Company ");
                    System.out.print("\nEnter the Company ID : ");
                    int Id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Company Name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter Company Location : ");
                    String location = sc.nextLine();
                    System.out.print("Enter Package Offered : ");
                    float c_package = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter Job Role : ");
                    String JobRole = sc.nextLine();
                    Company C = new Company(Id, name, location,
                            c_package, JobRole);
                    cd.addCompany(C);
                    break;
                case 2:
                    System.out.println("Display all Companies : ");
                    cd.displayAllCompanies();
                    break;
                case 3:
                    System.out.println("Search Company by id");
                    System.out.println("Enter Company ID : ");
                    int id = sc.nextInt();
                    cd.displayCompanyById(id);
                    break;
                case 4:
                    System.out.println("Update Company records ");
                    System.out.print("\nEnter new Company ID : ");
                    int up_Id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Company Name : ");
                    String up_name = sc.nextLine();
                    System.out.print("Enter new Company Location : ");
                    String up_location = sc.nextLine();
                    System.out.print("Enter new Package Offered : ");
                    float up_c_package = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter new Job Role : ");
                    String up_JobRole = sc.nextLine();
                    Company up_c =
                            new Company(up_Id, up_name, up_location,
                                    up_c_package, up_JobRole);
                    cd.updateCompany(up_Id, up_name, up_location,
                            up_c_package, up_JobRole);
                    break;
                case 5:
                    System.out.println("Delete Company Records");
                    System.out.println("Enter Company ID : ");
                    int d_id = sc.nextInt();
                    cd.deleteCompany(d_id);
                    break;
                case 6:
                    System.out.println("Thank you for visiting ! ");
                    break;
                default:
                    System.out.println("Invalid Choice !! ");
            }
        } while (choice != 6);

    }
    public void PlacementManagement(Scanner sc) {
        PlacementDao pd = new PlacementDao();
        int choice;
        do {
            System.out.println("\n\tPlacement Management System");
            System.out.println("1. Add Placement ");
            System.out.println("2. Display all placements ");
            System.out.println("3. Display placement record by ID");
            System.out.println("4. Update Placement records ");
            System.out.println("5. Delete Placement records ");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n\tAdd Placement");
                    System.out.print("Enter Placement ID : ");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Company ID : ");
                    int co_id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student ID : ");
                    int st_id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Company name : ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Job Role : ");
                    String jr = sc.nextLine();
                    System.out.print("Enter salary offered : ");
                    double sal = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Placement Status : ");
                    String status = sc.nextLine();
                    System.out.print("Enter Placement Date : ");
                    String date = sc.nextLine();
                    Placement p =
                            new Placement(ID, co_id, st_id, cname,
                                    jr, sal, status, date);
                    pd.addPlacement(p);
                    break;
                case 2:
                    System.out.println("\tDisplay all Placements Records ");
                    pd.DisplayAllPlacements();
                    break;
                case 3:
                    System.out.println("\tDisplay Placement by ID ");
                    System.out.print("Enter Placement ID : ");
                    int id = sc.nextInt();
                    pd.displayPlacementById(id);
                    break;
                case 4:
                    System.out.println("\tUpdate Placement Records ");
                    System.out.print("Enter Placement ID : ");
                    int up_ID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Company ID : ");
                    int up_co_id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student ID : ");
                    int up_st_id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Company name : ");
                    String up_cname = sc.nextLine();
                    System.out.print("Enter Job Role : ");
                    String up_jr = sc.nextLine();
                    System.out.print("Enter salary offered : ");
                    double up_sal = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Placement Status : ");
                    String up_status = sc.nextLine();
                    System.out.print("Enter Placement Date : ");
                    String up_date = sc.nextLine();
                    Placement placement =
                            new Placement(up_ID, up_co_id, up_st_id,
                                    up_cname, up_jr, up_sal,
                                    up_status, up_date);
                    pd.updatePlacement(up_ID, up_co_id, up_st_id,
                            up_cname, up_jr, up_sal,
                            up_status, up_date);
                    break;
                case 5:
                    System.out.println("\tDelete Placement Records ");
                    System.out.println("Enter Placement ID : ");
                    int del_id = sc.nextInt();
                    pd.deletePlacement(del_id);
                    break;
                case 6:
                    System.out.println("\nThank you for visiting !!");
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
            System.out.print("\nEnter your choice : ");
            choices = sc.nextInt();
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
                    System.out.println("Thank you for visiting !!");
                    break;
                default:
                    System.out.println("Invalid choice, Select right choice");
            }
        } while (choices != 4);
        sc.close();
    }
}
