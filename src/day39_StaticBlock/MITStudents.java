package day39_StaticBlock;

public class MITStudents {
    public String name, gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasReplit, hasFlipGrid;



    static {
        schoolName="MIT";
        dreamJob="Engineer";
        hasFlipGrid=true;
        hasReplit=true;

    }

    public void getInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MITStudents{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", School="+schoolName+
                '}';
    }
}
