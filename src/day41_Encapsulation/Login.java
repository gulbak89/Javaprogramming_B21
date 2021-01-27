package day41_Encapsulation;

public class Login {

    public static void main(String[] args) {



        Credentials obj1=new Credentials();
        //System.out.println(obj1.userName);  can not be called throuhg another class

        System.out.println(obj1.getUserName());

        System.out.println(obj1.getPassword());

        //obj1.getPassword()=12346565;  getter is for read only, we cannot

        obj1.setPassword(2344454);
        System.out.println(obj1.getPassword());
    }
}
