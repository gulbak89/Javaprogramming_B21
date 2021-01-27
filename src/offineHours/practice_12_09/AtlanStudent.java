package offineHours.practice_12_09;

public class AtlanStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName="Atlan", dreamJob="Tester";
    public static boolean hasReplit=true, hasFlipGrid=true;

    public void setInfo(String name, int age, char gender){

        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "AtlanStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", school name="+schoolName+
                ", dream job="+dreamJob+
                ", has replit="+hasReplit+
                ", has flipGrid="+hasFlipGrid+
                '}';
    }
}
