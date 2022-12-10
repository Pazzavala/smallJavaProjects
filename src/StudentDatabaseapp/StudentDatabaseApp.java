package StudentDatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // Ask how many new users will be added
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount of new students: ");
        int numOfStudents = in.nextInt();

        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payBalance();
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString());
        }


    }
}