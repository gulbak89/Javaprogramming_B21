package day44_Inheritance.webDriverTask;

public class FireFoxDriver extends RemoteDriver{

    public FireFoxDriver() {
        super("FireFox", "V83.0.0");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" from FireFox driver");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox driver");
    }

    @Override
    public void maximise() {
        System.out.println("Maximising FireFox driver");
    }
}
