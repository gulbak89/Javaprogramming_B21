package day43_Inheritance.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public static boolean haskitchen;
    public static boolean hasCashier;

    static {
        hasCashier=true;
        haskitchen=true;
    }


    public String owner;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner){
        this.owner=owner;
        servers=new ArrayList<>();
        chefs=new ArrayList<>();
    }

    public void hireServer(Server server){
        this.servers.add(server);

    }

    public void hireServer(Server[] server){
        servers.addAll(Arrays.asList(server));

       /* for (Server each: server){      we can also use loop to complete the method.
            servers.add(each);
        }*/
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chef){
        chefs.addAll(Arrays.asList(chef));
    }

    public void terminateEmployee(String ID){
        servers.removeIf(p->p.ID.equals(ID));
        chefs.removeIf(p->p.equals(ID));

    }

    @Override
    public String toString() {
        return "Owner: "+owner+", total number of employee: "+(chefs.size()+servers.size())+
                ", number of servers: "+servers.size()+", number of chefs: "+chefs.size();
    }
}
