package day38_staticKeyword.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {


        Testers tester1=new Testers();
        Testers tester2=new Testers();
        Testers tester3=new Testers();

        Developers developer1=new Developers();
        Developers developer2=new Developers();
        Developers developer3=new Developers();
        Developers developer4=new Developers();

        tester1.setInfo("Jane","t123","QA","Camcast",115000,'F');
        tester2.setInfo("Mike","t365","SDET","Amazone",130000,'M');
        tester3.setInfo("Nancy","t886","SDET","Youtube",135000,'F');

        developer1.setInfo("Jully","d198","Software Ingeener","Yahoo",200000,'F');
        developer2.setInfo("Max","d872","Software Ingeener","goodle",220000,'M');
        developer3.setInfo("Maria","d987","Software Ingeener","State Farm",160000,'F');
        developer4.setInfo("John","d395","Software Ingeener","CSV",150000,'M');


        Testers[] testers={tester2,tester3};

        ScrumTeam scrum1=new ScrumTeam();
        scrum1.addTester(tester1);
        scrum1.addTester(testers);

        Developers[] developers={developer1,developer2,developer3,developer4};
        scrum1.addDeveloper(developers);

        System.out.println(scrum1);

        scrum1.setInfo("Kate","Matt","Sara");


        System.out.println(scrum1);

        for(Developers each:scrum1.developersTeam){
            System.out.println(each);
        }

        for(Testers each: scrum1.testersTeam){

            System.out.println(each);
        }
        System.out.println("====================================");

        ScrumTeam scrum2=new ScrumTeam();
        scrum2.setInfo("Melike","Baki","Kelbinur");
        System.out.println(scrum2);


        Testers testers4=new Testers();
        Testers testers5=new Testers();

        Developers developer5=new Developers();
        Developers developer6=new Developers();

        developer5.setInfo("jule","d109","Developer","Bank Of America",150000,'F');
        developer6.setInfo("Carl","d662","Developer","Apple",230000,'M');

        testers4.setInfo("Sam","t999","QA","Wells Fargo",100000,'M');
        testers5.setInfo("Susan","t298","SDET","MicroSoft",130000,'F');

        scrum2.addDevelooper(developer5);
        scrum2.addDevelooper(developer6);
        scrum2.addTester(testers4);
        scrum1.addTester(testers5);



        System.out.println(scrum1);

        scrum1.removeDeveloper("d395");
        System.out.println(scrum1);


        System.out.println("=================================-");

        ScrumTeam[] scrum={scrum1,scrum2 };

        for (ScrumTeam eachScrum: scrum){
           for(Developers each: eachScrum.developersTeam){
               System.out.println(each.name+", $"+each.salary);
           }
        }

        for (ScrumTeam eachScrum: scrum){
            for (Testers each: eachScrum.testersTeam){

                System.out.println(each.name+", $"+each.salary);
            }
        }

        System.out.println("========================================");

        int countDevelopers=0;
        int countTesters=0;

        for (ScrumTeam eachScrum: scrum){
            countTesters+=eachScrum.testersTeam.size();
            countDevelopers+=eachScrum.developersTeam.size();

        }

        System.out.println("Total testers in those 2 Scrum Team: "+countTesters);
        System.out.println("Total developers in those 2 Scrum Team: "+countDevelopers);


        System.out.println("=======================================");


        scrum[0].SM="Atilla";
        scrum[1].SM="Mehtumsula";
        System.out.println(scrum[0].SM);
        System.out.println(scrum[1].SM);
        System.out.println("======================================");

        ArrayList<ScrumTeam> scrumList=new ArrayList<>();
        scrumList.addAll(Arrays.asList(scrum));

        for(int i=0; i<scrumList.size();i++){
            ScrumTeam eachTeam=scrumList.get(i);

            for (int j=0; j<eachTeam.testersTeam.size(); j++){


                Testers eachTester=eachTeam.testersTeam.get(j);

                System.out.println(eachTester.name+", $"+eachTester.salary);
            }

            for(int k=0; k<eachTeam.developersTeam.size();k++){

                Developers eachDeveloper=eachTeam.developersTeam.get(k);
                System.out.println(eachDeveloper.name+", $"+eachDeveloper.salary);
            }
        }












    }
}
