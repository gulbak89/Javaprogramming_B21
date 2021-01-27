package day38_staticKeyword.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Testers> testersTeam=new ArrayList<>();
    public ArrayList<Developers> developersTeam=new ArrayList<>();


    public static boolean hasSprint=true;
    public static boolean hasMeeting=true;

    public void setInfo(String PO, String BA, String SM){
        this.PO=PO;
        this.BA=BA;
        this.SM=SM;



    }

    public void addTester(Testers tester){
        testersTeam.add(tester);

    }

    public void addTester(Testers[] testers){
        testersTeam.addAll(Arrays.asList(testers));
    }

    public void removeTester(String ID){

        testersTeam.removeIf(p->p.ID.equals(ID));

    }

    public void addDevelooper(Developers developer){
        developersTeam.add(developer);


    }

    public void addDeveloper(Developers[] developers){
        developersTeam.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(String ID){

        developersTeam.removeIf(p->p.ID.equals(ID));
    }

    public String toString(){
        return "Product Owner: "+PO+", BA: "+BA+", SM"+SM+" ToTal number of Testers: "+testersTeam.size()+", Total number of developers: "+developersTeam.size();
    }
















}
