package day36_CustomClass;

public class Offer {

    public String location, jobTile,companyNmae;
    public double salaray;
    public boolean hasBenefit, isWFH, hasFullTime, hasPTO;


    public void setInfo(String location, String jobTile, String companyNmae, double salaray, boolean hasBenefit, boolean isWFH, boolean hasFullTime, boolean hasPTO) {
        this.location = location;
        this.jobTile = jobTile;
        this.companyNmae = companyNmae;
        this.salaray = salaray;
        this.hasBenefit = hasBenefit;
        this.isWFH = isWFH;
        this.hasFullTime = hasFullTime;
        this.hasPTO = hasPTO;
    }

    public void getInfo(){
        System.out.println("-------------------------");
        System.out.println("Company: "+companyNmae+", Job title: "+jobTile+", Location: "+location+", Salary: "+salaray+", "+hasBenefit+", "+isWFH+", "+hasFullTime+", "+hasPTO);
        System.out.println("-------------------------");




    }


}


