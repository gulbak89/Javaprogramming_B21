package day35_CustumClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        String[] countries={"United States","United Kingdom", "United Uyghur Land","Canada","Japan","South Africa","Korea"};

        ArrayList<String> coutryList=new ArrayList<>(Arrays.asList(countries));

        coutryList.removeIf(p->p.length()>=10);

        System.out.println(coutryList);


        System.out.println("=========================================");

        LocalDate[] dates={LocalDate.of(2002,7,1),LocalDate.of(2005,9,1),LocalDate.of(2008,6,8),
        LocalDate.of(2009,7,5),LocalDate.of(2016,10,1),LocalDate.of(2018,4,30),LocalDate.of(2020,5,15)};


        ArrayList<LocalDate> dateList=new ArrayList<>(Arrays.asList(dates));
        LocalDate Date=LocalDate.of(2016,8,15);

        dateList.removeIf(p->p.isBefore(Date));

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM-dd-yyyy, EEE");

        for (LocalDate each:dateList){
            System.out.println(each.format(df));
        }

        System.out.println(dateList);


        System.out.println("==========================================");

        String[] jobTitles={"SDET","QA","Net Work Engineer","Developer","Business Analyst","PO"};
        ArrayList<String> titleList=new ArrayList<>(Arrays.asList(jobTitles));
        //titleList.retainAll(Arrays.asList("QA","SDET"));

        titleList.removeIf(p-> !p.equalsIgnoreCase("SDET") && !p.equalsIgnoreCase("QA"));


        System.out.println(titleList);

        System.out.println("===================================================");

        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,101,87,34,65,200,405));

        //numbers.removeIf(p->p>=100);  solution one

        ArrayList<Integer> temp=new ArrayList<>();
        for (Integer each: numbers){
            if(each<=100){
                temp.add(each);
            }
        }

        numbers=temp;

        System.out.println(numbers);



        System.out.println("=============================================");









    }

}
