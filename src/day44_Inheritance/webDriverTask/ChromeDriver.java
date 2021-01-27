package day44_Inheritance.webDriverTask;

public class ChromeDriver extends RemoteDriver {

    public ChromeDriver() {
        super("Chrome Driver", "V84.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" from Chrome driver");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome driver");
    }

    @Override
    public void maximise() {
        System.out.println("Maximising Chrome driver");
    }
}
