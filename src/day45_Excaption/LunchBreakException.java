package day45_Excaption;

public class LunchBreakException  extends RuntimeException{

    public LunchBreakException(){
        super("It is time for lunch");
    }

    public LunchBreakException(String arg){
       super(arg);
    }


}

class Test{

    public static void main(String[] args) {


        throw new LunchBreakException("we need to take lunch");
    }
}
