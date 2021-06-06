
package asg2test;


public class ClassDescription {
     private String briefExplaination;
    private String month;
    String IntroductionToProgramming, ObjectOrientedProgramming, GraphicUsersInterface;
    double OurServicesPrice;

        public ClassDescription(String bE, String m, String IntroToPro, String OOP, String GUI, double OurServicesPrice) {
        this.briefExplaination = bE;
        this.month = m;
        this.IntroductionToProgramming = IntroToPro;
        this.ObjectOrientedProgramming = OOP;
        this.GraphicUsersInterface = GUI;
        this.OurServicesPrice = OurServicesPrice;
    }

    public String getBriefExplaination() {
        return briefExplaination;
    }

    public void setBriefExplaination(String briefExplaination) {
        this.briefExplaination = briefExplaination;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getIntroductionToProgramming() {
        return IntroductionToProgramming;
    }

    public void setIntroductionToProgramming(String IntroductionToProgramming) {
        this.IntroductionToProgramming = IntroductionToProgramming;
    }

    public String getObjectOrientedProgramming() {
        return ObjectOrientedProgramming;
    }

    public void setObjectOrientedProgramming(String ObjectOrientedProgramming) {
        this.ObjectOrientedProgramming = ObjectOrientedProgramming;
    }

    public String getGraphicUsersInterface() {
        return GraphicUsersInterface;
    }

    public void setGraphicUsersInterface(String GraphicUsersInterface) {
        this.GraphicUsersInterface = GraphicUsersInterface;
    }

    public double getOurServicesPrice() {
        return OurServicesPrice;
    }

    public void setOurServicesPrice(double OurServicesPrice) {
        this.OurServicesPrice = OurServicesPrice;
    }

    public void OurServices(int choice) {
        if (choice == 1) {
            OurServicesPrice = 50.00;
        }
        if (choice == 2) {
            OurServicesPrice = 60.00;
        }
        if (choice == 3) {
            OurServicesPrice = 100.00;
        }
    }

}
