package day50_Polymorphism;

public interface A {

    void readBook();
    abstract  void watchTV();
}

abstract  class B implements  A{
    public void readBook(){
        System.out.println("Reading book");
    }


}

class C extends  B{
    public void watchTV(){
        System.out.println();
    }
}
