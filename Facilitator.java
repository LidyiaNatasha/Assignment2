package com.java.project;


public class Facilitator extends EducationDayCampsCompany {

     private String name, gender, address, camp;
     private int age, id;
     private double salary;

    public Facilitator(){

    }

    public Facilitator(int id, String name, String gender, String address, String camp, int age, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.camp = camp;
        this.age = age;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getCamp() {
        return camp;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void printCompanyInfo(){
        super.printInfo();
    }
    @Override
    public void printInfo() {
        System.out.println("ID                  : " + getId());
        System.out.println("Name                : " + getName());
        System.out.println("Gender              : " + getGender());
        System.out.println("Address             : " + getAddress());
        System.out.println("Facilitating Camp   : " + getCamp());
        System.out.println("Age                 : " + getAge() + "years old");
        System.out.println("Salary              : RM " + getSalary());

    }

}
