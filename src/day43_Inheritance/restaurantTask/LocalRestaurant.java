package day43_Inheritance.restaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1=new Restaurant("Kamiljan");

        restaurant1.hireServer(new Server("Max",'M',19,"waiter","s231",30));
        restaurant1.hireServer(new Server("Mike",'M',20,"waiter","s632",30));
        restaurant1.hireServer(new Server("Marry",'F',21,"waitress","s927",35));

        restaurant1.hireChef(new Chef("Sam",'M',40,"Main Chef","c214",55));
        restaurant1.hireChef(new Chef("Sally",'F',32,"assistance Chef","c215",45));
        restaurant1.hireChef(new Chef("Kale",'M',34," Chef","c217",40));

        System.out.println(restaurant1);

        System.out.println("====================================");
        double budget=0;
        for (Server each: restaurant1.servers){

            System.out.println(each.name);
            budget+=each.calSalary();
        }

        System.out.println("budget for server: "+budget);

        System.out.println("===================================");

        double budget2=0;
        for (Chef each: restaurant1.chefs){
            System.out.println(each.name);
            budget2+= each.calSalary();

        }

        System.out.println("budget for chefs: "+budget2);










    }
}
