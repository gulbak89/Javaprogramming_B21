package offineHours.practice_1_13.zooTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog=new Dog("Chiwawa","brown","small",5,'F');
        Cat cat=new Cat("British short-hair","grey","middle",3,'M');
        Shark shark=new Shark("Whale shark","White","large",10,'M');

        dog.speak();
        cat.speak();
        shark.speak();

        dog.bark(5);
        cat.scratch("the wall");
        shark.hunt();




    }
}
