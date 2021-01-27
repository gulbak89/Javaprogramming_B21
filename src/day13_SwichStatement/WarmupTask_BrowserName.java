package day13_SwichStatement;

public class WarmupTask_BrowserName {
    public static void main(String[] args) {

        String browserName = "firefox";
        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge" || browserName == "ie") {
            if (browserName == "chrome") {
                browserName = "chrome";
            } else if (browserName == "firefox") {
                browserName = "firefox";
            } else if (browserName == "opera") {
                browserName = "opera";
            } else if (browserName == "safari") {
                browserName = "safari";
            } else if (browserName == "edge") {
                browserName = "edge";
            } else {
                browserName = "ie";
            }

        } else {
            browserName = "invalid browser";
        }

        System.out.println(browserName);


    }


}
