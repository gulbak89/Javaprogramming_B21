package offineHours.practice_12_23;

public class FaceBook {

    public static void main(String[] args) {

        PO productOwner=new PO("Sam","p123",'M',180000,true);
        BA businessAnalyst=new BA("Nancy","b232",'F',160000,true);
        ScrumMaster scrumMaster=new ScrumMaster("Ketty","s238",'F',135000,true);

        ScrumTeam scrumTeam=new ScrumTeam(productOwner,scrumMaster,businessAnalyst);

        System.out.println(scrumTeam);

        Tester tester1=new Tester("July","t342","QA",'F',100000,true);
        Tester tester2=new Tester("Tom","t487","SDET",'M',110000,true);
        Tester tester3=new Tester("Marry","t488","SDET",'F',110000,true);

        Developer[] developers={new Developer("Sara","d376","Software Engineer",'F',155000,true),
                new Developer("John","d922","developer",'M',155000,true),
                new Developer("Matt","d928","developer",'M',160000,true)

        };

        System.out.println(scrumTeam);

        scrumTeam.addTester(tester1);
        scrumTeam.addTester(tester2);
        scrumTeam.addTester(tester3);

        scrumTeam.addDeveloper(developers);

        System.out.println(scrumTeam);

        scrumTeam.removeTester("t488");

        System.out.println(scrumTeam);

        System.out.println("======================================");

        for (Tester each: scrumTeam.testers){
            System.out.println(each.name+", $"+each.salary);
        }

        System.out.println(scrumTeam.getProductOwner());

        System.out.println(scrumTeam.getBusinessAnalist());

        System.out.println(scrumTeam.getScrumMaster());




    }
}
