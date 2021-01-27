package day45_Excaption;


import java.time.LocalTime;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("it is break time");
    }

    public BreakTimeException(String arg){
        super(arg);
    }
}

class Test2{

    public static void main(String[] args) {

        LocalTime currentTime=LocalTime.now();

        if(currentTime.equals(LocalTime.of(10,45))){
            throw new BreakTimeException();
        }else if(currentTime.equals(LocalTime.of(11,45))){
            throw new BreakTimeException();
        }else if(currentTime.equals(LocalTime.of(14,45))){
            throw new BreakTimeException();
        }else if(currentTime.equals(LocalTime.of(15,45))){
            throw new BreakTimeException();
        }else if(currentTime.equals(LocalTime.of(16,45))){
            throw new BreakTimeException("Class dismiss ");
        }


    }
}


