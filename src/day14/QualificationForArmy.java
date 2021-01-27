package day14;

public class QualificationForArmy {
    public static void main(String[] args) {

        String resident = "USA ";
        int age = 16;
        String diploma ="HighSchool";

        if(resident=="USA " || resident=="is Alien" || resident=="is USA resident"){

            if(age>=17 && age<=34){
                if(diploma=="HighSchool" ||diploma=="College" ||diploma=="Master" || diploma=="PHD" ||diploma=="MD"){

                    System.out.println("You are eligible to join the Army");
                }else{
                    System.out.println("Your diploma should at least be High School diploma");
                }
                }else{
                System.out.println("Your age must be between 17 and 34 ");

        }
    }else {
            System.out.println("You are not Eligible to join the Army");
        }
}

    }
