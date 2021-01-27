package day49_Abstraction;

interface X{
   void x();
}

interface Y extends X{
    void y();
}

interface Z extends X,Y{
    void z();
}

public interface InterfaceInheritance extends X,Y,Z {  // inheritance between interface is allowed; class can implements multiple interface;
                                                       // class can extends only one class(super)
    void q();

}

class practice implements InterfaceInheritance{

    @Override
    public void q(){

    }

    @Override
    public void x() {

    }

    @Override
    public void y() {

    }

    @Override
    public void z() {

    }
}
