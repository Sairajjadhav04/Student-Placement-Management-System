package com.studentplacement;
import com.studentplacement.model.Student;
import com.studentplacement.dao.StudentDao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDao sd = new StudentDao();
        int choices;

        do {
            System.out.println("\tStudent Management System");
            System.out.println("1. Add the Student ");
            System.out.println("2. Show all Students ");
            System.out.println("3. Delete the student ");
            System.out.println("4. Update the student ");
            System.out.println("5. Search the student ");
            System.out.println("6. Exit");
            System.out.println("Enter your choice : 1");
            choices = sc.nextInt();
            sc.nextLine();

            switch (choices)
            {
                case 1 :
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
                    Student Sd = new Student(id,name,email,branch,cgpa);
                    sd.addStudent(Sd);
                    break;
                case 2 :
                    System.out.println("\tDisplay all Students");
                    sd.displayAllStudents();
                    break;
                case 3 :
                    System.out.println("\tDelete the Student");
                    System.out.println("Enter Student Id to delete : ");
                    int Delete_ID = sc.nextInt();
                    sd.deleteStudent(Delete_ID);
                    break;
                case 4 :
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
                    Student Update_Student = new Student(update_id,update_name,update_email,update_branch
                            ,update_cgpa);
                    sd.updateStudent(update_id,update_name,update_email,update_branch,update_cgpa);
                    break;
                case 5 :
                    System.out.println("\tSearch the Student");
                    System.out.println("Enter ID to search the student : ");
                    int Search_id = sc.nextInt();
                    sd.displayStudentById(Search_id);
                    break;
                case 6 :
                    System.out.println("Thank you for your response visit again !! ");
                    break;
                default:
                    System.out.println("Invalid choice , Enter correct choice !");

            }
        }
        while (choices!=6);
        sc.close();
    }
}
