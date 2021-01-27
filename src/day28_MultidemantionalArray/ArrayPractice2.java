package day28_MultidemantionalArray;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] names={"Mark","John","Susan","Anna","Mary"};
                      // 0       1      2      3      4

        int[] salary={1000,1200,1500,900,1000};
                   //  0    1      2    3    4



        int max=salary[0];
        String NameOfMax="";
        int min=salary[0];
        String NameOfMin="";

        for (int i=0; i< names.length; i++){
            System.out.println(names[i]+": $ "+salary[i]);


            if(salary[i]>max){

                max=salary[i];
                NameOfMax=names[i];

            if(salary[i]<min)  {
                min=salary[i];
                NameOfMin=names[i];
            }



            }

        }

        System.out.println(NameOfMax+" has the maximum salary of $"+max);
        System.out.println(NameOfMin+" has the minimum salary of $"+min);







    }
}
