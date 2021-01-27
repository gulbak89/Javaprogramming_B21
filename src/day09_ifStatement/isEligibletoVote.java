package day09_ifStatement;

public class isEligibletoVote {

    public static void main(String[] args) {

        String name = "Jimmy";
        boolean isUScitizen = true ;
        int age = 25;
        boolean hasCriminalBackground = false;

        boolean isEligible = isUScitizen==true && age >= 18 && hasCriminalBackground==false;   // "AND LOGIC" ==> "&&"
                                // true  ==  true && true &&  false == false
                                //  true && true && true ==>true

        System.out.println(name+" is eligible to vote is "+ isEligible);

        System.out.println("==================================================");

        String name2 = "John";
        String C1 = "USA";
        String C2 = "UK";

        boolean eligible = C1 == "USA"|| C2== "UK" ; // "OR LOGIC" ==> "||"
                         // true || false ==> true
        System.out.println(name2+" is eligible to vote is "+ eligible);

        System.out.println("==================================================");

        String Name = "Hong";
        String c1 = "Canada";
        String c2 = "Korea";

        boolean isEligibletovote = c1 == "USA" || c2 == "USA";

        System.out.println(Name+ " is eligible to vote is "+ isEligibletovote);

        System.out.println("====================================================");

        int num = 10;
         boolean isEven = num%2==0;
         boolean isOdd = !isEven;

        System.out.println("====================================================");

        System.out.println(false == !true);

        System.out.println(false != true && !false ==true);

        System.out.println(!false != false || false);

        System.out.println(!false != false && false);

        System.out.println(true && true && true && false);

        System.out.println(false && false && false && true);









    }
}
