package Emailapp;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String companySuffix = "company.com";
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("\nYour password is: " + this.password);

        // Combine elements to generate Email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

        System.out.println("Email Generated: " + email +"\n");
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Department Codes\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter department code: ");
        try (Scanner in = new Scanner(System.in)) {
            int depChoice = in.nextInt();

            if (depChoice == 1) return "Sales";
            else if (depChoice == 2) return "Development";
            else if (depChoice == 3) return "Accounting";
            else return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set alt email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change password
    public void changePassword(String password) {
        this.password = password;
    }

    // Get name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Get email
    public String getEmail() {
        if (alternateEmail != null)
            return alternateEmail;
        else return email;
    }

    // Get mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String showInfo() {
        return  "Display Name: " + getName() +
                "\nCompany Email: " + getEmail() +
                "\nMailbox Capacity: " + getMailboxCapacity() + "\n";
    }


    public String getPassword() {
        return password;
    }
}
