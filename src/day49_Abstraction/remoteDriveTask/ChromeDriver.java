package day49_Abstraction.remoteDriveTask;

public class ChromeDriver extends RemoteDriver {

    @Override
    public void executeScript(String script) {
        System.out.println("Script "+script+ " is executed on Chrome ");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("Taking screenShot on the Chrome");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to  "+URL+" on Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing chrome Browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting Chrome browser");
    }
}
