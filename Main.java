
package asg2test;


public class Main {

   int choice;
    public static void main(String[] args) {
       Employee e = new Employee ("Female", "hbjbhvh", 25, 2500, 12345, 40.00, 42.00, "hannah", "hana1232@gmail.com", "bjwdvedwe", 012347447); 
        System.out.println("The gender : " + e.getGender());
        System.out.println("The address :  " + e.getAddress());
        System.out.println("The age :  " + e.getAge());
        System.out.println("The salary :  " + e.getSalary());
        System.out.println("The id :  " + e.getId());
        System.out.println("The total hours worked :  " + e.getTotalHoursWorked());
        System.out.println("The name  :  " + e.getName());
        System.out.println("The email :  " + e.getEmail());
        System.out.println("The location :  " + e.getLocation());
        System.out.println("The contact number : " + e.getContactNo());

        
        
        
      Registration r = new Registration ("Better Service", "july", "e", "f","f", 25,"Jackson","male", "hhcv67", "dckjec ej",25, 012474);
        System.out.println("Description : " + r.getBriefExplaination());
        System.out.println("The month : " + r.getMonth());
        System.out.println("The subject : " + r.getIntroductionToProgramming());
        System.out.println("The subject : " + r.getObjectOrientedProgramming());
        System.out.println("The subject : " + r.getGraphicUsersInterface());
        System.out.println("The service : " + r.getOurServicesPrice());
        System.out.println("The name : " + r.getName());
        System.out.println("The gender : " + r.getGender());
        System.out.println("The email : "  + r.getEmail());
        System.out.println("The address : " + r.getAddress());
        System.out.println("The age : " + r.getAge());
        System.out.println("The contact number : " + r.getContactNo());
        r.OurServices();
 
    }
    
}
