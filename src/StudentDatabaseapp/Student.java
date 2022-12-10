package StudentDatabaseapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentYear;
    private int gradeYear;
    private String uniqueID;
//    private String courses = "";
    private List<String> courses = new ArrayList<String>();
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter students name and year
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("\n\nEnter Student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student grade year: ");
        gradeYear = in.nextInt();
        if (gradeYear == 1) this.studentYear = "Freshman";
        else if (gradeYear == 2) this.studentYear = "Sophomore";
        else if (gradeYear == 3) this.studentYear = "Junior";
        else this.studentYear = "Senior";

        setUniqueID();
        enroll();

        in.close();
    }

    // Generate an ID
    private void setUniqueID() {
        // Each time we create a student we should increment the id for entire class
        id++;

        // Grade year + ID
        this.uniqueID = gradeYear + "" + id;
        this.uniqueID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        String course;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter course to enroll (q to quit): ");
            course = in.nextLine();
            if (!course.equals("q")) {
                courses.add(course);
                tuitionBalance += courseCost;
            }
            in.close();

        } while (!course.equals("q"));
    }

    // View balance
    public void viewTuitionBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payBalance() {
        Scanner in = new Scanner(System.in);
        viewTuitionBalance();
        System.out.print("Enter your payment: $");
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;

        System.out.println("Thank you your payment of $" + payment);

        viewTuitionBalance();

        in.close();
    }

    // Check student status
    public String toString() {
        return "\nStudent Name: " + firstName + " " + lastName + "\nStudent Grade year: " + studentYear + "\nStudent ID: " + uniqueID
                + "\nCourses enrolled: " + courses + "\nAccount Balance: $" + tuitionBalance;
     }

}
