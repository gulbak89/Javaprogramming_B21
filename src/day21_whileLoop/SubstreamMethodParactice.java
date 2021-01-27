package day21_whileLoop;

public class SubstreamMethodParactice {
    public static void main(String[] args) {

        String email="John_Daniel@BOFA.com";

        int indexof= email.indexOf("_");
        int indexofAt= email.indexOf("@");
        int indexofDot= email.indexOf(".");

        String lastName=email.substring(0, indexof);
        String domain=email.substring(indexofAt,indexofAt+1);


        String firstName=email.substring(indexof+1,indexofAt);
        String companyName=email.substring(indexofAt+1,indexofDot);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(companyName);
        System.out.println(domain);
    }
}
