package day29_methods;

public class MethodWithoutParameter {
    public          static       void          main(String[] args) {
 //AccessModifier  Specifier  returnType    MethodName(Parameter)
 //

        printHello5Times();
        System.out.println("Mike");
        printHello5Times();
        System.out.println("MIT");
        printHello5Times();


        MethodsWithoutParameters2.PrintEvenFrom1To100(); // called Method through the Class name (Static)
        MethodsWithoutParameters2.PrintOddFrom1to100();



    }

   public static void printHello5Times() {   //customized method should be created out side the main method and inside the class


      for (int i=1; i<=5; i++) {
          System.out.println("Hello");
      }

   }

}

