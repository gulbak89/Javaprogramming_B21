package day38_staticKeyword;

public class HarwardStudent {

    public String name;
    public int age, groupNumber;
    public char gender;

    public static String schoolName ="Harvard University";
    public static boolean isOnlineStudent=true;


    public void setInfo(String name, int age, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }

    public void study(){

        System.out.println(name+" is studying Java");

    }

    public static void getSchoolInfo(){

        System.out.println(schoolName);
    }



    @Override
    public String toString() {
        return "HarwardStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", isOnline="+isOnlineStudent+
                ", SchoolName="+schoolName+
                '}';
    }
}
