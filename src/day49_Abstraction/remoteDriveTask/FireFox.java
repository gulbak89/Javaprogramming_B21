package day49_Abstraction.remoteDriveTask;

public class FireFox extends RemoteDriver  {

    @Override
    public void executeScript(String script) {
        System.out.println("Script "+script+ " is executed on FireFox ");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("Taking screenShot on the FireFox");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to  "+URL+" on FireFox");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox Browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting FireFox browser");
    }
}
