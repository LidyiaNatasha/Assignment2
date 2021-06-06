package asg2test;

import java.util.Scanner;

public class Employee extends EducationDayCampsCompany {
 Scanner scan = new Scanner (System.in);
    private String gender, address;
    private int age, salary, id, standardHours = 40;
    private double totalHoursWorked, standardWage = 37.5, totalWage, overtimeBonus = 2.50;

    public Employee(String gender, String address, int age, int salary, int id, double totalHoursWorked, double totalWage, String n, String e, String l, int cN) {
        super(n, e, l, cN);
        this.gender = gender;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.id = id;
        this.totalHoursWorked = totalHoursWorked;
        this.totalWage = totalWage;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStandardHours() {
        return standardHours;
    }

    public void setStandardHours(int standardHours) {
        this.standardHours = standardHours;
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getStandardWage() {
        return standardWage;
    }

    public void setStandardWage(double standardWage) {
        this.standardWage = standardWage;
    }

    public double getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(double totalWage) {
        this.totalWage = totalWage;
    }

    public double getOvertimeBonus() {
        return overtimeBonus;
    }

    public void setOvertimeBonus(double overtimeBonus) {
        this.overtimeBonus = overtimeBonus;
    }

    

    public void calcSalary() {

        System.out.print("Enter number of hours worked: ");
        totalHoursWorked = scan.nextInt();
        if (totalHoursWorked > 40) {
            totalWage = (standardWage * totalHoursWorked + (totalHoursWorked - standardHours) * overtimeBonus);
        } else if (totalHoursWorked < 40) {
            totalWage = standardWage * totalHoursWorked;
        } else {
            totalWage = standardWage * standardHours;

            System.out.println("Your total salary of the week is: " + totalWage);
        }
    }
}
