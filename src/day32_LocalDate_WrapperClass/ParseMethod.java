package day32_LocalDate_WrapperClass;

public class ParseMethod {
    public static void main(String[] args) {

        String data1="123";
        System.out.println(data1+3);  //1233

        int num1= Integer.parseInt(data1);

        Integer num2= Integer.parseInt(data1); // Autoboxing
        // Wrapper Class <== Primitive

        System.out.println(num1+3);

        String s2="2.5";
        double d1= Double.parseDouble(s2); // not autoboxing nor unboxing
        // primitive <==primitive

        Double d2=Double.parseDouble(s2); // Autoboxing
        System.out.println(d1+3);

        String s3="true";
       boolean b1= Boolean.parseBoolean(s3);
       Boolean b2=Boolean.parseBoolean(s3);
        System.out.println(!b1);

        String s4="TRue";
        boolean b3=Boolean.parseBoolean(s4);  // parse method is not case sensitive
        Boolean b4=Boolean.parseBoolean(s4); //Autoboxing
        System.out.println(b3);




    }
}
