package day05_Concatenation;

public class PersonalInfo {
    public static void main(String[] args) {
        //first name, last name, full name, age, gender, phone number, SSN

        String firstName = "Gubek";
        String LastName = "Xapkat";
        String fullName = firstName +" " + LastName;
        byte age = 30;
        char gender = 'F';
        int phoneNumber = 28282888;
        int SSN = 10000001;

        System.out.println("Full Name is "+ fullName);
        System.out.println(fullName+ "' Gender is "+gender);
        System.out.println(fullName+" is "+ age+ " years old");
        System.out.println(fullName+"' Phone Number is "+phoneNumber);
        System.out.println(fullName+"' SSN is "+SSN);
    }
}
