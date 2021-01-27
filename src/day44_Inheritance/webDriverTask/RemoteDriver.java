package day44_Inheritance.webDriverTask;

public class RemoteDriver {

    public String name, version;

    public RemoteDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(String URL){
        System.out.println("opening "+URL+" from the  remote driver");

    }

    public void close(){
        System.out.println("closing the remote browser");
    }


    public void maximise(){
        System.out.println("maximising the remote driver");
    }


    @Override
    public String toString() {
        return "RemoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
