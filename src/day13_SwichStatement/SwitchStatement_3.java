package day13_SwichStatement;

public class SwitchStatement_3 {

    public static void main(String[] args) {

        String browser = "qq";


        switch (browser) {

            case "chrome": browser="chrome browser is selected";
            break;

            case "firefox": browser="firefox browser is selected ";
            break;

            case "opera": browser="opera browser is selected";
            break;

            case"safari": browser="safari browser is selected";
            break;

            case"edge": browser="edge browser is selected";
            break;

            case"ie": browser="ie browser is selected ";
            break;

            default: browser="invalid browser name";
            break;


        }

        System.out.println(browser);


    }
}
