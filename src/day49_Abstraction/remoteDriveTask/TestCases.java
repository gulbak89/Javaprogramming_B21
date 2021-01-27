package day49_Abstraction.remoteDriveTask;

public class TestCases {

    public static void main(String[] args) {


       ChromeDriver driver=new ChromeDriver();
       FireFox driver2=new FireFox();

       driver.get("http://www.google.com");
       driver.close();
        System.out.println("====================");

       driver2.get("http://www.youtube.com");
       driver2.takeScreenShot("pic");
       driver2.close();

        System.out.println("========================");







    }
}
