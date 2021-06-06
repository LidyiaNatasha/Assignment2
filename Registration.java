package asg2test;

import java.util.Scanner;

public class Registration extends ClassDescription {

    Scanner scan = new Scanner(System.in);
    private String name, gender, email, address, comment;
    private int age, contactNo;
    //private int choice;

    public Registration(String bE, String m, String IntroToPro, String OOP, String GUI, double OurServicesPrice, String name, String gender, String email, String address, int age, int contactNo) {
        super(bE, m, IntroToPro, OOP, GUI, OurServicesPrice);
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.age = age;
        this.contactNo = contactNo;
        this.comment = comment;
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public void OurServices() {
            System.out.println("Enter the subject choice (1. Introduction to Programming, 2. Object Oriented Programming, 3. Graphic Users Interface) : ");
            int choice = scan.nextInt();

            if (choice == 1) {
                OurServicesPrice = 50.00;
                System.out.println("The price for Introduction to Programming is : " + OurServicesPrice );
            }
            if (choice == 2) {
                OurServicesPrice = 60.00;
                System.out.println("The price for Object Oriented Programming : " + OurServicesPrice);
            }
            if (choice == 3) {
                OurServicesPrice = 100.00;
                System.out.println("The price for Graphic Users Interface : " + OurServicesPrice);

            }

    }
    
    public String getComment() {
    return this.comment;
    }

}