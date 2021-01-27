package offineHours.Practice_11_25;

public class MetodPracrice {

    public static void main(String[] args) {
        divisibleBy3();
        System.out.println();

        divisibleBy3(10,100);

        System.out.println();
        System.out.println("================");
        divisibleBy3(10,8);
        System.out.println();
        System.out.println("===================");

        grade(90);
        System.out.println("======================");

        eligibleToVote(18, true);



    }

    public static void divisibleBy3(){
        for (int i=0; i<=100; i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void divisibleBy3(int start, int end){
        if(end<=start){
            System.out.println("Invalid numbers");
            return;       // if we use System.exit here, the entire program will be terminated; the return exits the current method
        }

        for(int i=start; i<=end;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }

        }
    }

    public static void grade(int score){

        if(score <0 || score>100) {
            System.out.println("Invalid score");
            return;         // returns the current statement only

        }
            char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        switch (grade){
            case 'A':
                System.out.println("Excellent, you made an A");
                break;

            case 'B':
                System.out.println("Great, you made a B");
                break;

            case 'C':
                System.out.println("Good, you made a C");
                break;

                default:

                    System.out.println("You failed");





        }

    }

    public static void eligibleToVote(int age, boolean isUScitizen){
        if(age<18){
            System.out.println("You must be at least 18 years old");
            return;
        }

        if(isUScitizen==false){
            System.out.println("You must be a US citizen");
            return;
        }

        System.out.println("You can vote!");

    }
}
