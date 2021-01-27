package day13_SwichStatement;

public class Nameofmonth_switchStatement {

    public static void main(String[] args) {

        int num = 13;
        String NameofMonth = "";

        switch(num) {
            case 1:  NameofMonth="Jan";
            break;

            case 2: NameofMonth="Feb";
            break;

            case 3: NameofMonth="March";
                break;

            case 4: NameofMonth="April";
                break;


            case 5: NameofMonth="Friday";
                break;

            case 6: NameofMonth="Saturday";
                break;

            case 7: NameofMonth="July";
                break;


            case 8: NameofMonth="Aug";
                break;

            case 9: NameofMonth="Sept";
                break;

            case 10: NameofMonth="Oct";
                break;


            case 11: NameofMonth="Nov";
                break;

            case 12: NameofMonth="Dec";
                break;

            default:
                System.out.println("invalid value");
                break;


        }

        System.out.println(NameofMonth);






    }
}
