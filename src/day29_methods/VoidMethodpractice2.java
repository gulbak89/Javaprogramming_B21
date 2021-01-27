package day29_methods;

public class VoidMethodpractice2 {

    public static void main(String[] args) {

        EligibleToVote("CANADA",18,true);
        Calculator(2,'+',5);


    }

public static void EligibleToVote(String citizenShip, int age, boolean isAlive){

        if(citizenShip.equalsIgnoreCase("USA")){
            if(isAlive){
                if(age>=18){
                    System.out.println("You are eligible to vote!");
                }else{
                    System.err.println("You are too young to vote");
                }

            }else{
                System.err.println("You must be alive");
            }

        }else{
            System.err.println("You must be US citizen ");
        }

}

public static void Calculator(double n1,char operator,double n2){
        boolean isValid=operator=='+'||operator=='-'||operator=='%'||operator=='*'||operator=='/';
        if(isValid){
            switch (operator){
                case'+':System.out.println(n1+n2);
                break;

                case'-': System.out.println(n1-n2);
                break;

                case'*': System.out.println(n1*n2);
                break;

                case'/': System.out.println(n1/n2);
                break;

                case'%': System.out.println(n1%n2);
                break;





            }

        }else{
            System.err.println("Invalid operator");
        }
}
}
