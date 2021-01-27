package day11_MultiBranch_if_statement;

public class Name_of_Month2 {

    public static void main(String[] args) {

        int month = 2;
        String NameMonth= (month==1)? "January": (month==2)? "February": (month==3)? "March": (month==4)? "April": (month==5)? "May": (month==6)? "June": (month==7)? "July": (month==8)? "August": (month==9)? "September": (month==10)? "October": (month==11)? "NOvember": "December";
        System.out.println("it is "+NameMonth);
    }
}
