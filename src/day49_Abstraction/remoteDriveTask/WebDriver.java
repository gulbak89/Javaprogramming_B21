package day49_Abstraction.remoteDriveTask;

public interface WebDriver {

    void get(String URL);
    void close();
    void quit();

}
