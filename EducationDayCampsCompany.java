package com.java.project;


public  abstract  class EducationDayCampsCompany {

    private String compName, compEmail, compLocation;
    private int compContactNo;

    public EducationDayCampsCompany() {
        this.compName = "7DS COMPANY";
        this.compEmail = "7DS1234@gmail.com";
        this.compLocation = "No. 34 Bangunan Wangsa, Johor";
        this.compContactNo = 2;
    }

    public String getCompName() {
        return compName;
    }

    public String getCompEmail() {
        return compEmail;
    }

    public String getCompLocation() {
        return compLocation;
    }

    public int getCompContactNo() {
        return compContactNo;
    }


    public void printInfo() {
        System.out.println("\n********** INFORMATION OF EDUCATION DAY CAMPS COMPANY **********");
        System.out.println("Name " + getCompName());
        System.out.println("Email " + getCompEmail());
        System.out.println("Location " + getCompLocation());
        System.out.println("Contact Number " + getCompContactNo());
        System.out.println("****************************************************************");
    }

}
