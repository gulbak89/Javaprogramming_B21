package library;

import day43_Inheritance.personTask.Employee;

public class BA extends Employee {

    public static void main(String[] args) {


        System.out.println(BA.publicVariable);
        System.out.println(BA.protectedVariable);

    }
}

 class A{
     public static void main(String[] args) {

         System.out.println(Employee.publicVariable);
         System.out.println(BA.publicVariable);


         // protected: outside the package, only visible to the subClass
         // default:only visible within the package
         // public: always visible



     }
 }
