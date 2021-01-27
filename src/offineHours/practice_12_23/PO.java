package offineHours.practice_12_23;

public class PO extends Employee {

    public PO(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, ID, "Product Owner", gender, salary, isFullTime);
    }

    public void acceptProduct(){
        System.out.println(jobTitle+" "+name+ " accepted the product");
    }

    public void rejectProdunt(){
        System.out.println(jobTitle+" "+name+" rejected the product");
    }

    public void writeUserStory(){
        System.out.println(jobTitle+" "+name+" is writing user story");
    }


}
